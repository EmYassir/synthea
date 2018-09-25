package org.mitre.synthea.world.agents;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mitre.synthea.world.geography.Location;

public class ProviderTest {

  // Check the three biggest states to make sure the QuadTree has
  // enough capacity: California, Texas, New York.
  private Location california = new Location("California", null);
  private Location texas = new Location("Texas", null);
  private Location newYork = new Location("New York", null);
  private Location city = new Location("Massachusetts", "Bedford");

  @Before
  public void clearProviders() {
    Provider.clear();
  }

  @Test
  public void testLoadProvidersByAbbreviation() {
    Provider.loadProviders(california);
    Assert.assertNotNull(Provider.getProviderList());
    Assert.assertFalse(Provider.getProviderList().isEmpty());
  }

  @Test
  public void testLoadProvidersByStateName() {
    Provider.loadProviders(california);
    Assert.assertNotNull(Provider.getProviderList());
    Assert.assertFalse(Provider.getProviderList().isEmpty());
  }

  @Test
  public void testLoadProvidersFromTexas() {
    Provider.loadProviders(texas);
    Assert.assertNotNull(Provider.getProviderList());
    Assert.assertFalse(Provider.getProviderList().isEmpty());
  }

  @Test
  public void testLoadProvidersFromNewYork() {
    Provider.loadProviders(newYork);
    Assert.assertNotNull(Provider.getProviderList());
    Assert.assertFalse(Provider.getProviderList().isEmpty());
  }

  @Test
  public void testGenerateClinicianByAbbreviation() {
    Provider.loadProviders(california);
    Assert.assertNotNull(Provider.getProviderList());
    Assert.assertFalse(Provider.getProviderList().isEmpty());
    Provider provider = Provider.getProviderList().get(0);
    Assert.assertNotNull(provider.clinicianMap);
    Map<String, ArrayList<Clinician>> clinicianMap = provider.clinicianMap;
    Assert.assertNotNull(clinicianMap.get("GENERAL PRACTICE"));
  }
  
  @Test
  public void testGenerateClinicianByState() {
    Provider.loadProviders(california);
    Assert.assertNotNull(Provider.getProviderList());
    Assert.assertFalse(Provider.getProviderList().isEmpty());
    Provider provider = Provider.getProviderList().get(0);
    Assert.assertNotNull(provider.clinicianMap);
    Map<String, ArrayList<Clinician>> clinicianMap = provider.clinicianMap;
    Assert.assertNotNull(clinicianMap.get("GENERAL PRACTICE"));
  }
  
  @Test
  public void testAllFacilitiesHaveAnId() {
    Provider.loadProviders(california);
    for (Provider p : Provider.getProviderList()) {
      Assert.assertNotNull(p.name + " has a null ID.", p.id);
    }
  }

  @Test
  public void testNearestInpatientInState() {
    Provider.loadProviders(california);
    Person person = new Person(0L);
    california.assignPoint(person, california.randomCityName(person.random));
    Provider provider = Provider.findClosestService(person, Provider.INPATIENT, 0);
    Assert.assertNotNull(provider);
  }

  @Test
  public void testNearestAmbulatoryInState() {
    Provider.loadProviders(california);
    Person person = new Person(0L);
    california.assignPoint(person, california.randomCityName(person.random));
    Provider provider = Provider.findClosestService(person, Provider.AMBULATORY, 0);
    Assert.assertNotNull(provider);
  }

  @Test
  public void testNearestEmergencyInState() {
    Provider.loadProviders(california);
    Person person = new Person(0L);
    california.assignPoint(person, california.randomCityName(person.random));
    Provider provider = Provider.findClosestService(person, Provider.EMERGENCY, 0);
    Assert.assertNotNull(provider);
  }

  @Test
  public void testNearestUrgentCareInState() {
    Provider.loadProviders(california);
    Person person = new Person(0L);
    california.assignPoint(person, california.randomCityName(person.random));
    Provider provider = Provider.findClosestService(person, Provider.URGENTCARE, 0);
    Assert.assertNotNull(provider); 
  }
  
  @Test
  public void testNearestInpatientInCity() {
    Provider.loadProviders(city);
    Person person = new Person(0L);
    city.assignPoint(person, city.randomCityName(person.random));
    Provider provider = Provider.findClosestService(person, Provider.INPATIENT, 0);
    Assert.assertNotNull(provider);
  }

  @Test
  public void testNearestAmbulatoryInCity() {
    Provider.loadProviders(city);
    Person person = new Person(0L);
    city.assignPoint(person, city.randomCityName(person.random));
    Provider provider = Provider.findClosestService(person, Provider.AMBULATORY, 0);
    Assert.assertNotNull(provider);
  }

  @Test
  public void testNearestEmergencyInCity() {
    Provider.loadProviders(city);
    Person person = new Person(0L);
    city.assignPoint(person, city.randomCityName(person.random));
    Provider provider = Provider.findClosestService(person, Provider.EMERGENCY, 0);
    Assert.assertNotNull(provider);
  }

  @Test
  public void testNearestUrgentCareInCity() {
    Provider.loadProviders(city);
    Person person = new Person(0L);
    city.assignPoint(person, city.randomCityName(person.random));
    Provider provider = Provider.findClosestService(person, Provider.URGENTCARE, 0);
    Assert.assertNotNull(provider);
  }
  
  @Test
  public void testVaFacilityOnlyAcceptsVeteran() {
    Provider.loadProviders(california);
    Provider vaProvider = Provider.getProviderList()
                                  .stream()
                                  .filter(p -> "VA Facility".equals(p.type))
                                  .findFirst().get();
    Person veteran = new Person(0L);
    veteran.attributes.put("veteran", "vietnam");
    Person nonVet = new Person(1L);

    Assert.assertTrue(vaProvider.accepts(veteran, System.currentTimeMillis()));
    Assert.assertFalse(vaProvider.accepts(nonVet, System.currentTimeMillis()));
  }

  @Test
  public void testAllFiles() throws Exception {
    // just load all files and make sure they don't crash
    URL providersFolder = ClassLoader.getSystemClassLoader().getResource("providers");
    Set<String> providerServices = new HashSet<String>();
    providerServices.add(Provider.WELLNESS);
    Path path = Paths.get(providersFolder.toURI());
    Files.walk(path)
         .filter(Files::isReadable)
         .filter(Files::isRegularFile)
         .filter(p -> p.toString().endsWith(".csv"))
         .forEach(t -> {
           try {
             Provider.clear();
             Provider.loadProviders(california, "providers/" + t.getFileName(),
                 providerServices);
           } catch (Exception e) {
             throw new RuntimeException("Failed to load provider file " + t, e);
           }
         });
  }
}
