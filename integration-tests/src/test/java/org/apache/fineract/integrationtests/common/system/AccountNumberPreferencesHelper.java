/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.integrationtests.common.system;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.fineract.integrationtests.common.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountNumberPreferencesHelper {

    private static final Logger LOG = LoggerFactory.getLogger(AccountNumberPreferencesHelper.class);
    private final RequestSpecification requestSpec;

    private final ResponseSpecification responseSpec;

    private static final String ACCOUNT_NUMBER_FORMATS_REQUEST_URL = "/fineract-provider/api/v1/accountnumberformats";

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public AccountNumberPreferencesHelper(final RequestSpecification requestSpec, final ResponseSpecification responseSpec) {
        this.requestSpec = requestSpec;
        this.responseSpec = responseSpec;
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Object createClientAccountNumberPreference(ResponseSpecification responseSpec, String jsonAttributeToGetBack) {
        LOG.info("---------------------------------CREATING CLIENT ACCOUNT NUMBER PREFERENCE------------------------------------------");

        final String requestJSON = new AccountNumberPreferencesTestBuilder().clientBuild();

        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "?" + Utils.TENANT_IDENTIFIER;

        return Utils.performServerPost(this.requestSpec, responseSpec, URL, requestJSON, jsonAttributeToGetBack);
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Object createLoanAccountNumberPreference(ResponseSpecification responseSpec, String jsonAttributeToGetBack) {
        LOG.info("---------------------------------CREATING LOAN ACCOUNT NUMBER PREFERENCE------------------------------------------");

        final String requestJSON = new AccountNumberPreferencesTestBuilder().loanBuild();

        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "?" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerPost(this.requestSpec, responseSpec, URL, requestJSON, jsonAttributeToGetBack);
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Object createSavingsAccountNumberPreference(ResponseSpecification responseSpec, String jsonAttributeToGetBack) {
        LOG.info("---------------------------------CREATING SAVINGS ACCOUNT NUMBER PREFERENCE------------------------------------------");

        final String requestJSON = new AccountNumberPreferencesTestBuilder().savingsBuild();

        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "?" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerPost(this.requestSpec, responseSpec, URL, requestJSON, jsonAttributeToGetBack);

    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Object createGroupsAccountNumberPreference(ResponseSpecification responseSpec, String jsonAttributeToGetBack) {
        LOG.info("---------------------------------CREATING GROUPS ACCOUNT NUMBER PREFERENCE------------------------------------------");

        final String requestJSON = new AccountNumberPreferencesTestBuilder().groupsBuild();

        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "?" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerPost(this.requestSpec, responseSpec, URL, requestJSON, jsonAttributeToGetBack);

    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Object createCenterAccountNumberPreference(ResponseSpecification responseSpec, String jsonAttributeToGetBack) {
        LOG.info("---------------------------------CREATING CENTER ACCOUNT NUMBER PREFERENCE------------------------------------------");

        final String requestJSON = new AccountNumberPreferencesTestBuilder().centerBuild();

        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "?" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerPost(this.requestSpec, responseSpec, URL, requestJSON, jsonAttributeToGetBack);

    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public HashMap<String, Object> createAccountNumberPreferenceWithInvalidData(ResponseSpecification responseSpec, String accountType,
            String prefixType, String jsonAttributeToGetBack) {

        final String requestJSON = new AccountNumberPreferencesTestBuilder().invalidDataBuild(accountType, prefixType);

        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "?" + Utils.TENANT_IDENTIFIER;
        return Utils.performServerPost(this.requestSpec, responseSpec, URL, requestJSON, jsonAttributeToGetBack);

    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public HashMap<String, Object> updateAccountNumberPreference(final Integer accountNumberFormatId, final String prefixType,
            ResponseSpecification responseSpec, String jsonAttributeToGetBack) {

        final String requestJSON = new AccountNumberPreferencesTestBuilder().updatePrefixType(prefixType);

        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "/" + accountNumberFormatId + "?" + Utils.TENANT_IDENTIFIER;

        return Utils.performServerPut(this.requestSpec, responseSpec, URL, requestJSON, jsonAttributeToGetBack);

    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public HashMap<String, Object> deleteAccountNumberPreference(final Integer accountNumberFormatId, ResponseSpecification responseSpec,
            String jsonAttributeToGetBack) {

        LOG.info("---------------------------------DELETING ACCOUNT NUMBER PREFERENCE------------------------------------------");

        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "/" + accountNumberFormatId + "?" + Utils.TENANT_IDENTIFIER;

        return Utils.performServerDelete(this.requestSpec, responseSpec, URL, jsonAttributeToGetBack);
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public Object getAccountNumberPreference(final Integer accountNumberFormatId, final String jsonAttributeToGetBack) {
        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "/" + accountNumberFormatId + "?" + Utils.TENANT_IDENTIFIER;

        return Utils.performServerGet(requestSpec, responseSpec, URL, jsonAttributeToGetBack);
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public ArrayList<HashMap<String, Object>> getAllAccountNumberPreferences() {
        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "?" + Utils.TENANT_IDENTIFIER;
        final ArrayList<HashMap<String, Object>> response = Utils.performServerGet(requestSpec, responseSpec, URL, "");
        return response;
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public void verifyCreationOfAccountNumberPreferences(final Integer clientAccountNumberPreferenceId,
            final Integer loanAccountNumberPreferenceId, final Integer savingsAccountNumberPreferenceId,
            final Integer groupsAccountNumberPreferenceId, final Integer centerAccountNumberPreferenceId,
            ResponseSpecification responseSpec, RequestSpecification requestSpec) {

        final String clientURL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "/" + clientAccountNumberPreferenceId + "?" + Utils.TENANT_IDENTIFIER;

        Utils.performServerGet(requestSpec, responseSpec, clientURL, "id");

        final String loanURL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "/" + loanAccountNumberPreferenceId + "?" + Utils.TENANT_IDENTIFIER;

        Utils.performServerGet(requestSpec, responseSpec, loanURL, "id");

        final String savingsURL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "/" + savingsAccountNumberPreferenceId + "?"
                + Utils.TENANT_IDENTIFIER;

        Utils.performServerGet(requestSpec, responseSpec, savingsURL, "id");

        final String groupsURL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "/" + groupsAccountNumberPreferenceId + "?" + Utils.TENANT_IDENTIFIER;

        Utils.performServerGet(requestSpec, responseSpec, groupsURL, "id");

        final String centerURL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "/" + centerAccountNumberPreferenceId + "?" + Utils.TENANT_IDENTIFIER;

        Utils.performServerGet(requestSpec, responseSpec, centerURL, "id");
    }

    // TODO: Rewrite to use fineract-client instead!
    // Example: org.apache.fineract.integrationtests.common.loans.LoanTransactionHelper.disburseLoan(java.lang.Long,
    // org.apache.fineract.client.models.PostLoansLoanIdRequest)
    @Deprecated(forRemoval = true)
    public void verifyUpdationOfAccountNumberPreferences(final Integer accountNumberPreferenceId, ResponseSpecification responseSpec,
            RequestSpecification requestSpec) {

        final String URL = ACCOUNT_NUMBER_FORMATS_REQUEST_URL + "/" + accountNumberPreferenceId + "?" + Utils.TENANT_IDENTIFIER;
        Utils.performServerGet(requestSpec, responseSpec, URL, "id");

    }
}
