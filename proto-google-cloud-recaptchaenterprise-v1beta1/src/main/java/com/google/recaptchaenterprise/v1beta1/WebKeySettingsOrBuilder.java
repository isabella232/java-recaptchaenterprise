/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1beta1;

public interface WebKeySettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1beta1.WebKeySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether allowed_domains is enforced or not.
   * </pre>
   *
   * <code>bool enforce_allowed_domains = 3;</code>
   *
   * @return The enforceAllowedDomains.
   */
  boolean getEnforceAllowedDomains();

  /**
   *
   *
   * <pre>
   * Domains or subdomains of websites allowed to use the key. All subdomains
   * of an allowed domain are automatically allowed. A valid domain requires a
   * host and must not include any path, port, query or fragment.
   * Examples: 'example.com' or 'subdomain.example.com'
   * </pre>
   *
   * <code>repeated string allowed_domains = 1;</code>
   *
   * @return A list containing the allowedDomains.
   */
  java.util.List<java.lang.String> getAllowedDomainsList();
  /**
   *
   *
   * <pre>
   * Domains or subdomains of websites allowed to use the key. All subdomains
   * of an allowed domain are automatically allowed. A valid domain requires a
   * host and must not include any path, port, query or fragment.
   * Examples: 'example.com' or 'subdomain.example.com'
   * </pre>
   *
   * <code>repeated string allowed_domains = 1;</code>
   *
   * @return The count of allowedDomains.
   */
  int getAllowedDomainsCount();
  /**
   *
   *
   * <pre>
   * Domains or subdomains of websites allowed to use the key. All subdomains
   * of an allowed domain are automatically allowed. A valid domain requires a
   * host and must not include any path, port, query or fragment.
   * Examples: 'example.com' or 'subdomain.example.com'
   * </pre>
   *
   * <code>repeated string allowed_domains = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The allowedDomains at the given index.
   */
  java.lang.String getAllowedDomains(int index);
  /**
   *
   *
   * <pre>
   * Domains or subdomains of websites allowed to use the key. All subdomains
   * of an allowed domain are automatically allowed. A valid domain requires a
   * host and must not include any path, port, query or fragment.
   * Examples: 'example.com' or 'subdomain.example.com'
   * </pre>
   *
   * <code>repeated string allowed_domains = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowedDomains at the given index.
   */
  com.google.protobuf.ByteString getAllowedDomainsBytes(int index);

  /**
   *
   *
   * <pre>
   * Whether this key can be used on AMP (Accelerated Mobile Pages) websites.
   * </pre>
   *
   * <code>bool allow_amp_traffic = 2;</code>
   *
   * @return The allowAmpTraffic.
   */
  boolean getAllowAmpTraffic();

  /**
   *
   *
   * <pre>
   * Required. Describes how this key is integrated with the website.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.WebKeySettings.IntegrationType integration_type = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for integrationType.
   */
  int getIntegrationTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Describes how this key is integrated with the website.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.WebKeySettings.IntegrationType integration_type = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The integrationType.
   */
  com.google.recaptchaenterprise.v1beta1.WebKeySettings.IntegrationType getIntegrationType();

  /**
   *
   *
   * <pre>
   * Settings for the frequency and difficulty at which this key triggers
   * captcha challenges. This should only be specified for IntegrationTypes
   * CHECKBOX_CHALLENGE and INVISIBLE_CHALLENGE.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.WebKeySettings.ChallengeSecurityPreference challenge_security_preference = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for challengeSecurityPreference.
   */
  int getChallengeSecurityPreferenceValue();
  /**
   *
   *
   * <pre>
   * Settings for the frequency and difficulty at which this key triggers
   * captcha challenges. This should only be specified for IntegrationTypes
   * CHECKBOX_CHALLENGE and INVISIBLE_CHALLENGE.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.WebKeySettings.ChallengeSecurityPreference challenge_security_preference = 5;
   * </code>
   *
   * @return The challengeSecurityPreference.
   */
  com.google.recaptchaenterprise.v1beta1.WebKeySettings.ChallengeSecurityPreference
      getChallengeSecurityPreference();
}