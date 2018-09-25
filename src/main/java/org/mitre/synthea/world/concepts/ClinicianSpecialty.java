package org.mitre.synthea.world.concepts;

import java.util.ArrayList;

public class ClinicianSpecialty {

  public static final String ADDICTION_MEDICINE = "ADDICTION MEDICINE";
  public static final String ADVANCED_HEART_FAILURE_AND_TRANSPLANT_CARDIOLOGY 
      = "ADVANCED HEART FAILURE AND TRANSPLANT CARDIOLOGY";
  public static final String ALLERGY_IMMUNOLOGY = "ALLERGY/IMMUNOLOGY";
  public static final String ANESTHESIOLOGY = "ANESTHESIOLOGY";
  public static final String ANESTHESIOLOGY_ASSISTANT = "ANESTHESIOLOGY ASSISTANT";
  public static final String AUDIOLOGIST = "AUDIOLOGIST";
  public static final String CARDIAC_ELECTROPHYSIOLOGY = "CARDIAC ELECTROPHYSIOLOGY";
  public static final String CARDIAC_SURGERY = "CARDIAC SURGERY";
  public static final String CARDIOLOGY = "CARDIOVASCULAR DISEASE (CARDIOLOGY)";
  public static final String CERTIFIED_NURSE_MIDWIFE = "CERTIFIED NURSE MIDWIFE";
  public static final String CERTIFIED_REGISTERED_NURSE_ANESTHETIST 
      = "CERTIFIED REGISTERED NURSE ANESTHETIST";
  public static final String CHIROPRACTIC = "CHIROPRACTIC";
  public static final String CLINICAL_NURSE_SPECIALIST = "CLINICAL NURSE SPECIALIST";
  public static final String CLINICAL_PSYCHOLOGIST = "CLINICAL PSYCHOLOGIST";
  public static final String CLINICAL_SOCIAL_WORKER = "CLINICAL SOCIAL WORKER";
  public static final String PROCTOLOGY = "COLORECTAL SURGERY (PROCTOLOGY)";
  public static final String INTENSIVIST = "CRITICAL CARE (INTENSIVISTS)";
  public static final String DENTIST = "DENTIST";
  public static final String DERMATOLOGY = "DERMATOLOGY";
  public static final String DIAGNOSTIC_RADIOLOGY = "DIAGNOSTIC RADIOLOGY";
  public static final String EMERGENCY_MEDICINE = "EMERGENCY MEDICINE";
  public static final String ENDOCRINOLOGY = "ENDOCRINOLOGY";
  public static final String FAMILY_PRACTICE = "FAMILY PRACTICE";
  public static final String GASTROENTEROLOGY = "GASTROENTEROLOGY";
  public static final String GENERAL_PRACTICE = "GENERAL PRACTICE";
  public static final String GENERAL_SURGERY = "GENERAL SURGERY";
  public static final String GERIATRIC_MEDICINE = "GERIATRIC MEDICINE";
  public static final String GERIATRIC_PSYCHIATRY = "GERIATRIC PSYCHIATRY";
  public static final String GYNECOLOGICAL_ONCOLOGY = "GYNECOLOGICAL ONCOLOGY";
  public static final String HAND_SURGERY = "HAND SURGERY";
  public static final String HEMATOLOGY = "HEMATOLOGY";
  public static final String HEMATOLOGY_ONCOLOGY = "HEMATOLOGY/ONCOLOGY";
  public static final String HEMATOPOIETIC_CELL_TRANSPLANTATION_AND_CELLULAR_TH 
      = "HEMATOPOIETIC CELL TRANSPLANTATION AND CELLULAR TH";
  public static final String HOSPICE_AND_PALLIATIVE_CARE = "HOSPICE/PALLIATIVE CARE";
  public static final String HOSPITALIST = "HOSPITALIST";
  public static final String INFECTIOUS_DISEASE = "INFECTIOUS DISEASE";
  public static final String INTERNAL_MEDICINE = "INTERNAL MEDICINE";
  public static final String INTERVENTIONAL_CARDIOLOGY = "INTERVENTIONAL CARDIOLOGY";
  public static final String INTERVENTIONAL_PAIN_MANAGEMENT = "INTERVENTIONAL PAIN MANAGEMENT";
  public static final String INTERVENTIONAL_RADIOLOGY = "INTERVENTIONAL RADIOLOGY";
  public static final String MAXILLOFACIAL_SURGERY = "MAXILLOFACIAL SURGERY";
  public static final String MEDICAL_ONCOLOGY = "MEDICAL ONCOLOGY";
  public static final String NEPHROLOGY = "NEPHROLOGY";
  public static final String NEUROLOGY = "NEUROLOGY";
  public static final String NEUROPSYCHIATRY = "NEUROPSYCHIATRY";
  public static final String NEUROSURGERY = "NEUROSURGERY";
  public static final String NUCLEAR_MEDICINE = "NUCLEAR MEDICINE";
  public static final String NURSE_PRACTITIONER = "NURSE PRACTITIONER";
  public static final String OBSTETRICS_GYNECOLOGY = "OBSTETRICS/GYNECOLOGY";
  public static final String OCCUPATIONAL_THERAPY = "OCCUPATIONAL THERAPY";
  public static final String OPHTHALMOLOGY = "OPHTHALMOLOGY";
  public static final String OPTOMETRY = "OPTOMETRY";
  public static final String ORAL_SURGERY = "ORAL SURGERY";
  public static final String ORTHOPEDIC_SURGERY = "ORTHOPEDIC SURGERY";
  public static final String OSTEOPATHIC_MANIPULATIVE_MEDICINE
      = "OSTEOPATHIC MANIPULATIVE MEDICINE";
  public static final String OTOLARYNGOLOGY = "OTOLARYNGOLOGY";
  public static final String PAIN_MANAGEMENT = "PAIN MANAGEMENT";
  public static final String PATHOLOGY = "PATHOLOGY";
  public static final String PEDIATRIC_MEDICINE = "PEDIATRIC MEDICINE";
  public static final String PERIPHERAL_VASCULAR_DISEASE = "PERIPHERAL VASCULAR DISEASE";
  public static final String PHYSICAL_MEDICINE_AND_REHABILITATION
      = "PHYSICAL MEDICINE AND REHABILITATION";
  public static final String PHYSICAL_THERAPY = "PHYSICAL THERAPY";
  public static final String PHYSICIAN_ASSISTANT = "PHYSICIAN ASSISTANT";
  public static final String PLASTIC_AND_RECONSTRUCTIVE_SURGERY 
      = "PLASTIC AND RECONSTRUCTIVE SURGERY";
  public static final String PODIATRY = "PODIATRY";
  public static final String PREVENTATIVE_MEDICINE = "PREVENTATIVE MEDICINE";
  public static final String PSYCHIATRY = "PSYCHIATRY";
  public static final String PULMONARY_DISEASE = "PULMONARY DISEASE";
  public static final String RADIATION_ONCOLOGY = "RADIATION ONCOLOGY";
  public static final String REGISTERED_DIETITIAN_OR_NUTRITION_PROFESSIONAL 
      = "REGISTERED DIETITIAN OR NUTRITION PROFESSIONAL";
  public static final String RHEUMATOLOGY = "RHEUMATOLOGY";
  public static final String SLEEP_MEDICINE = "SLEEP MEDICINE";
  public static final String SPEECH_LANGUAGE_PATHOLOGIST = "SPEECH LANGUAGE PATHOLOGIST";
  public static final String SPORTS_MEDICINE = "SPORTS MEDICINE";
  public static final String SURGICAL_ONCOLOGY = "SURGICAL ONCOLOGY";
  public static final String THORACIC_SURGERY = "THORACIC SURGERY";
  public static final String UNDEFINED = "UNDEFINED PHYSICIAN TYPE (SPECIFY)";
  public static final String UROLOGY = "UROLOGY";
  public static final String VASCULAR_SURGERY = "VASCULAR SURGERY";
  
  public static String[] getSpecialties() {
    String[] specialtyList = {"ADDICTION MEDICINE", 
      "ADVANCED HEART FAILURE AND TRANSPLANT CARDIOLOGY", "ALLERGY/IMMUNOLOGY", "ANESTHESIOLOGY", 
      "ANESTHESIOLOGY ASSISTANT", "AUDIOLOGIST","CARDIAC ELECTROPHYSIOLOGY","CARDIAC SURGERY",
      "CARDIOVASCULAR DISEASE (CARDIOLOGY)", "CERTIFIED NURSE MIDWIFE",
      "CERTIFIED REGISTERED NURSE ANESTHETIST", "CHIROPRACTIC", "CLINICAL NURSE SPECIALIST",
      "CLINICAL PSYCHOLOGIST", "CLINICAL SOCIAL WORKER", "COLORECTAL SURGERY (PROCTOLOGY)",
      "CRITICAL CARE (INTENSIVISTS)", "DENTIST", "DERMATOLOGY", 
      "DIAGNOSTIC RADIOLOGY","EMERGENCY MEDICINE", "ENDOCRINOLOGY", "FAMILY PRACTICE",
      "GASTROENTEROLOGY", "GENERAL PRACTICE", "GENERAL SURGERY", "GERIATRIC MEDICINE", 
      "GERIATRIC PSYCHIATRY", "GYNECOLOGICAL ONCOLOGY", "HAND SURGERY", "HEMATOLOGY",
      "HEMATOLOGY/ONCOLOGY", "HEMATOPOIETIC CELL TRANSPLANTATION AND CELLULAR TH",
      "HOSPICE/PALLIATIVE CARE", "HOSPITALIST", "INFECTIOUS DISEASE","INTERNAL MEDICINE",
      "INTERVENTIONAL CARDIOLOGY", "INTERVENTIONAL PAIN MANAGEMENT", "INTERVENTIONAL RADIOLOGY",
      "MAXILLOFACIAL SURGERY", "MEDICAL ONCOLOGY", "NEPHROLOGY", "NEUROLOGY", "NEUROPSYCHIATRY",
      "NEUROSURGERY", "NUCLEAR MEDICINE", "NURSE PRACTITIONER", "OBSTETRICS/GYNECOLOGY",
      "OCCUPATIONAL THERAPY", "OPHTHALMOLOGY", "OPTOMETRY", "ORAL SURGERY", "ORTHOPEDIC SURGERY",
      "OSTEOPATHIC MANIPULATIVE MEDICINE", "OTOLARYNGOLOGY", "PAIN MANAGEMENT",
      "PATHOLOGY", "PEDIATRIC MEDICINE", "PERIPHERAL VASCULAR DISEASE",
      "PHYSICAL MEDICINE AND REHABILITATION","PHYSICAL THERAPY", "PHYSICIAN ASSISTANT",
      "PLASTIC AND RECONSTRUCTIVE SURGERY", "PODIATRY", "PREVENTATIVE MEDICINE","PSYCHIATRY",
      "PULMONARY DISEASE", "RADIATION ONCOLOGY", "REGISTERED DIETITIAN OR NUTRITION PROFESSIONAL",
      "RHEUMATOLOGY", "SLEEP MEDICINE", "SPEECH LANGUAGE PATHOLOGIST", "SPORTS MEDICINE",
      "SURGICAL ONCOLOGY", "THORACIC SURGERY", "UNDEFINED PHYSICIAN TYPE (SPECIFY)", 
      "UROLOGY", "VASCULAR SURGERY"};

    return specialtyList;
  }
}
