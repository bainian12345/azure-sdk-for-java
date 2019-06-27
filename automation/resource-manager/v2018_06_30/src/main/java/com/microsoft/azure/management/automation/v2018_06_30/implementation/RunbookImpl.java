/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30.implementation;

import com.microsoft.azure.management.automation.v2018_06_30.Runbook;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookCreateOrUpdateParameters;
import org.joda.time.DateTime;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookDraft;
import java.util.List;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookParameter;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookProvisioningState;
import com.microsoft.azure.management.automation.v2018_06_30.ContentLink;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookTypeEnum;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookState;
import rx.functions.Func1;

class RunbookImpl extends CreatableUpdatableImpl<Runbook, RunbookInner, RunbookImpl> implements Runbook, Runbook.Definition, Runbook.Update {
    private final AutomationManager manager;
    private String resourceGroupName;
    private String automationAccountName;
    private String runbookName;
    private RunbookCreateOrUpdateParameters createParameter;
    private RunbookUpdateParameters updateParameter;

    RunbookImpl(String name, AutomationManager manager) {
        super(name, new RunbookInner());
        this.manager = manager;
        // Set resource name
        this.runbookName = name;
        //
        this.createParameter = new RunbookCreateOrUpdateParameters();
        this.updateParameter = new RunbookUpdateParameters();
    }

    RunbookImpl(RunbookInner inner, AutomationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.runbookName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.automationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "automationAccounts");
        this.runbookName = IdParsingUtils.getValueFromIdByName(inner.id(), "runbooks");
        //
        this.createParameter = new RunbookCreateOrUpdateParameters();
        this.updateParameter = new RunbookUpdateParameters();
    }

    @Override
    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Runbook> createResourceAsync() {
        RunbooksInner client = this.manager().inner().runbooks();
        return client.createOrUpdateAsync(this.resourceGroupName, this.automationAccountName, this.runbookName, this.createParameter)
            .map(new Func1<RunbookInner, RunbookInner>() {
               @Override
               public RunbookInner call(RunbookInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Runbook> updateResourceAsync() {
        RunbooksInner client = this.manager().inner().runbooks();
        return client.updateAsync(this.resourceGroupName, this.automationAccountName, this.runbookName, this.updateParameter)
            .map(new Func1<RunbookInner, RunbookInner>() {
               @Override
               public RunbookInner call(RunbookInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RunbookInner> getInnerAsync() {
        RunbooksInner client = this.manager().inner().runbooks();
        return client.getAsync(this.resourceGroupName, this.automationAccountName, this.runbookName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new RunbookCreateOrUpdateParameters();
        this.updateParameter = new RunbookUpdateParameters();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public RunbookDraft draft() {
        RunbookDraftInner inner = this.inner().draft();
        if (inner != null) {
            return  new RunbookDraftImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer jobCount() {
        return this.inner().jobCount();
    }

    @Override
    public String lastModifiedBy() {
        return this.inner().lastModifiedBy();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Integer logActivityTrace() {
        return this.inner().logActivityTrace();
    }

    @Override
    public Boolean logProgress() {
        return this.inner().logProgress();
    }

    @Override
    public Boolean logVerbose() {
        return this.inner().logVerbose();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<String> outputTypes() {
        return this.inner().outputTypes();
    }

    @Override
    public Map<String, RunbookParameter> parameters() {
        return this.inner().parameters();
    }

    @Override
    public RunbookProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ContentLink publishContentLink() {
        return this.inner().publishContentLink();
    }

    @Override
    public RunbookTypeEnum runbookType() {
        return this.inner().runbookType();
    }

    @Override
    public RunbookState state() {
        return this.inner().state();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public RunbookImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    @Override
    public RunbookImpl withRunbookType(RunbookTypeEnum runbookType) {
        this.createParameter.withRunbookType(runbookType);
        return this;
    }

    @Override
    public RunbookImpl withDraft(RunbookDraftInner draft) {
        this.createParameter.withDraft(draft);
        return this;
    }

    @Override
    public RunbookImpl withPublishContentLink(ContentLink publishContentLink) {
        this.createParameter.withPublishContentLink(publishContentLink);
        return this;
    }

    @Override
    public RunbookImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameter.withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public RunbookImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.createParameter.withLocation(location);
        } else {
            this.updateParameter.withLocation(location);
        }
        return this;
    }

    @Override
    public RunbookImpl withLogActivityTrace(Integer logActivityTrace) {
        if (isInCreateMode()) {
            this.createParameter.withLogActivityTrace(logActivityTrace);
        } else {
            this.updateParameter.withLogActivityTrace(logActivityTrace);
        }
        return this;
    }

    @Override
    public RunbookImpl withLogProgress(Boolean logProgress) {
        if (isInCreateMode()) {
            this.createParameter.withLogProgress(logProgress);
        } else {
            this.updateParameter.withLogProgress(logProgress);
        }
        return this;
    }

    @Override
    public RunbookImpl withLogVerbose(Boolean logVerbose) {
        if (isInCreateMode()) {
            this.createParameter.withLogVerbose(logVerbose);
        } else {
            this.updateParameter.withLogVerbose(logVerbose);
        }
        return this;
    }

    @Override
    public RunbookImpl withName(String name) {
        if (isInCreateMode()) {
            this.createParameter.withName(name);
        } else {
            this.updateParameter.withName(name);
        }
        return this;
    }

    @Override
    public RunbookImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameter.withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
