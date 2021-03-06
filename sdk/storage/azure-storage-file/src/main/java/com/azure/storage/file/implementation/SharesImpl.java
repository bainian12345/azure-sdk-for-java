// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.implementation;

import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.annotation.BodyParam;
import com.azure.core.implementation.annotation.Delete;
import com.azure.core.implementation.annotation.ExpectedResponses;
import com.azure.core.implementation.annotation.Get;
import com.azure.core.implementation.annotation.HeaderParam;
import com.azure.core.implementation.annotation.Host;
import com.azure.core.implementation.annotation.HostParam;
import com.azure.core.implementation.annotation.PathParam;
import com.azure.core.implementation.annotation.Put;
import com.azure.core.implementation.annotation.QueryParam;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceInterface;
import com.azure.core.implementation.annotation.ServiceMethod;
import com.azure.core.implementation.annotation.UnexpectedResponseExceptionType;
import com.azure.core.util.Context;
import com.azure.storage.file.models.DeleteSnapshotsOptionType;
import com.azure.storage.file.models.SharesCreatePermissionResponse;
import com.azure.storage.file.models.SharesCreateResponse;
import com.azure.storage.file.models.SharesCreateSnapshotResponse;
import com.azure.storage.file.models.SharesDeleteResponse;
import com.azure.storage.file.models.SharesGetAccessPolicyResponse;
import com.azure.storage.file.models.SharesGetPermissionResponse;
import com.azure.storage.file.models.SharesGetPropertiesResponse;
import com.azure.storage.file.models.SharesGetStatisticsResponse;
import com.azure.storage.file.models.SharesSetAccessPolicyResponse;
import com.azure.storage.file.models.SharesSetMetadataResponse;
import com.azure.storage.file.models.SharesSetQuotaResponse;
import com.azure.storage.file.models.SignedIdentifier;
import com.azure.storage.file.models.StorageErrorException;
import java.util.List;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Shares.
 */
public final class SharesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private SharesService service;

    /**
     * The service client containing this operation class.
     */
    private AzureFileStorageImpl client;

    /**
     * Initializes an instance of SharesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SharesImpl(AzureFileStorageImpl client) {
        this.service = RestProxy.create(SharesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureFileStorageShares to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureFileStorageShares")
    private interface SharesService {
        @Put("{shareName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesCreateResponse> create(@PathParam("shareName") String shareName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-share-quota") Integer quota, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, Context context);

        @Get("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesGetPropertiesResponse> getProperties(@PathParam("shareName") String shareName, @HostParam("url") String url, @QueryParam("sharesnapshot") String sharesnapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, Context context);

        @Delete("{shareName}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesDeleteResponse> delete(@PathParam("shareName") String shareName, @HostParam("url") String url, @QueryParam("sharesnapshot") String sharesnapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-delete-snapshots") DeleteSnapshotsOptionType deleteSnapshots, @QueryParam("restype") String restype, Context context);

        @Put("{shareName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesCreateSnapshotResponse> createSnapshot(@PathParam("shareName") String shareName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Put("{shareName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesCreatePermissionResponse> createPermission(@PathParam("shareName") String shareName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesGetPermissionResponse> getPermission(@HostParam("url") String url, @HeaderParam("x-ms-file-permission-key") String filePermissionKey, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Put("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesSetQuotaResponse> setQuota(@PathParam("shareName") String shareName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-share-quota") Integer quota, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Put("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesSetMetadataResponse> setMetadata(@PathParam("shareName") String shareName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesGetAccessPolicyResponse> getAccessPolicy(@PathParam("shareName") String shareName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Put("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesSetAccessPolicyResponse> setAccessPolicy(@PathParam("shareName") String shareName, @HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") SignedIdentifiersWrapper shareAcl, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesGetStatisticsResponse> getStatistics(@PathParam("shareName") String shareName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);
    }

    /**
     * Creates a new share under the specified account. If the share with the same name already exists, the operation fails.
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesCreateResponse> createWithRestResponseAsync(String shareName, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final Integer quota = null;
        final String restype = "share";
        return service.create(shareName, this.client.getUrl(), timeout, metadata, quota, this.client.getVersion(), restype, context);
    }

    /**
     * Creates a new share under the specified account. If the share with the same name already exists, the operation fails.
     *
     * @param shareName The name of the target share.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param quota Specifies the maximum size of the share, in gigabytes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesCreateResponse> createWithRestResponseAsync(String shareName, Integer timeout, Map<String, String> metadata, Integer quota, Context context) {
        final String restype = "share";
        return service.create(shareName, this.client.getUrl(), timeout, metadata, quota, this.client.getVersion(), restype, context);
    }

    /**
     * Returns all user-defined metadata and system properties for the specified share or share snapshot. The data returned does not include the share's list of files.
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesGetPropertiesResponse> getPropertiesWithRestResponseAsync(String shareName, Context context) {
        final String sharesnapshot = null;
        final Integer timeout = null;
        final String restype = "share";
        return service.getProperties(shareName, this.client.getUrl(), sharesnapshot, timeout, this.client.getVersion(), restype, context);
    }

    /**
     * Returns all user-defined metadata and system properties for the specified share or share snapshot. The data returned does not include the share's list of files.
     *
     * @param shareName The name of the target share.
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesGetPropertiesResponse> getPropertiesWithRestResponseAsync(String shareName, String sharesnapshot, Integer timeout, Context context) {
        final String restype = "share";
        return service.getProperties(shareName, this.client.getUrl(), sharesnapshot, timeout, this.client.getVersion(), restype, context);
    }

    /**
     * Operation marks the specified share or share snapshot for deletion. The share or share snapshot and any files contained within it are later deleted during garbage collection.
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesDeleteResponse> deleteWithRestResponseAsync(String shareName, Context context) {
        final String sharesnapshot = null;
        final Integer timeout = null;
        final DeleteSnapshotsOptionType deleteSnapshots = null;
        final String restype = "share";
        return service.delete(shareName, this.client.getUrl(), sharesnapshot, timeout, this.client.getVersion(), deleteSnapshots, restype, context);
    }

    /**
     * Operation marks the specified share or share snapshot for deletion. The share or share snapshot and any files contained within it are later deleted during garbage collection.
     *
     * @param shareName The name of the target share.
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param deleteSnapshots Specifies the option include to delete the base share and all of its snapshots. Possible values include: 'include'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesDeleteResponse> deleteWithRestResponseAsync(String shareName, String sharesnapshot, Integer timeout, DeleteSnapshotsOptionType deleteSnapshots, Context context) {
        final String restype = "share";
        return service.delete(shareName, this.client.getUrl(), sharesnapshot, timeout, this.client.getVersion(), deleteSnapshots, restype, context);
    }

    /**
     * Creates a read-only snapshot of a share.
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesCreateSnapshotResponse> createSnapshotWithRestResponseAsync(String shareName, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String restype = "share";
        final String comp = "snapshot";
        return service.createSnapshot(shareName, this.client.getUrl(), timeout, metadata, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Creates a read-only snapshot of a share.
     *
     * @param shareName The name of the target share.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesCreateSnapshotResponse> createSnapshotWithRestResponseAsync(String shareName, Integer timeout, Map<String, String> metadata, Context context) {
        final String restype = "share";
        final String comp = "snapshot";
        return service.createSnapshot(shareName, this.client.getUrl(), timeout, metadata, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Create a permission (a security descriptor).
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesCreatePermissionResponse> createPermissionWithRestResponseAsync(String shareName, Context context) {
        final Integer timeout = null;
        final String restype = "share";
        final String comp = "filepermission";
        return service.createPermission(shareName, this.client.getUrl(), timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Create a permission (a security descriptor).
     *
     * @param shareName The name of the target share.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesCreatePermissionResponse> createPermissionWithRestResponseAsync(String shareName, Integer timeout, Context context) {
        final String restype = "share";
        final String comp = "filepermission";
        return service.createPermission(shareName, this.client.getUrl(), timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Returns the permission (security descriptor) for a given key.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesGetPermissionResponse> getPermissionWithRestResponseAsync(Context context) {
        final String filePermissionKey = null;
        final Integer timeout = null;
        final String restype = "share";
        final String comp = "filepermission";
        return service.getPermission(this.client.getUrl(), filePermissionKey, timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Returns the permission (security descriptor) for a given key.
     *
     * @param filePermissionKey Key of the permission to be set for the directory/file. Note: Only one of the x-ms-file-permission or x-ms-file-permission-key should be specified.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesGetPermissionResponse> getPermissionWithRestResponseAsync(String filePermissionKey, Integer timeout, Context context) {
        final String restype = "share";
        final String comp = "filepermission";
        return service.getPermission(this.client.getUrl(), filePermissionKey, timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Sets quota for the specified share.
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesSetQuotaResponse> setQuotaWithRestResponseAsync(String shareName, Context context) {
        final Integer timeout = null;
        final Integer quota = null;
        final String restype = "share";
        final String comp = "properties";
        return service.setQuota(shareName, this.client.getUrl(), timeout, this.client.getVersion(), quota, restype, comp, context);
    }

    /**
     * Sets quota for the specified share.
     *
     * @param shareName The name of the target share.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param quota Specifies the maximum size of the share, in gigabytes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesSetQuotaResponse> setQuotaWithRestResponseAsync(String shareName, Integer timeout, Integer quota, Context context) {
        final String restype = "share";
        final String comp = "properties";
        return service.setQuota(shareName, this.client.getUrl(), timeout, this.client.getVersion(), quota, restype, comp, context);
    }

    /**
     * Sets one or more user-defined name-value pairs for the specified share.
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesSetMetadataResponse> setMetadataWithRestResponseAsync(String shareName, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String restype = "share";
        final String comp = "metadata";
        return service.setMetadata(shareName, this.client.getUrl(), timeout, metadata, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Sets one or more user-defined name-value pairs for the specified share.
     *
     * @param shareName The name of the target share.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesSetMetadataResponse> setMetadataWithRestResponseAsync(String shareName, Integer timeout, Map<String, String> metadata, Context context) {
        final String restype = "share";
        final String comp = "metadata";
        return service.setMetadata(shareName, this.client.getUrl(), timeout, metadata, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Returns information about stored access policies specified on the share.
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesGetAccessPolicyResponse> getAccessPolicyWithRestResponseAsync(String shareName, Context context) {
        final Integer timeout = null;
        final String restype = "share";
        final String comp = "acl";
        return service.getAccessPolicy(shareName, this.client.getUrl(), timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Returns information about stored access policies specified on the share.
     *
     * @param shareName The name of the target share.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesGetAccessPolicyResponse> getAccessPolicyWithRestResponseAsync(String shareName, Integer timeout, Context context) {
        final String restype = "share";
        final String comp = "acl";
        return service.getAccessPolicy(shareName, this.client.getUrl(), timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Sets a stored access policy for use with shared access signatures.
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesSetAccessPolicyResponse> setAccessPolicyWithRestResponseAsync(String shareName, Context context) {
        final Integer timeout = null;
        final String restype = "share";
        final String comp = "acl";
        SignedIdentifiersWrapper shareAclConverted = new SignedIdentifiersWrapper(null);
        return service.setAccessPolicy(shareName, this.client.getUrl(), shareAclConverted, timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Sets a stored access policy for use with shared access signatures.
     *
     * @param shareName The name of the target share.
     * @param shareAcl The ACL for the share.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesSetAccessPolicyResponse> setAccessPolicyWithRestResponseAsync(String shareName, List<SignedIdentifier> shareAcl, Integer timeout, Context context) {
        final String restype = "share";
        final String comp = "acl";
        SignedIdentifiersWrapper shareAclConverted = new SignedIdentifiersWrapper(shareAcl);
        return service.setAccessPolicy(shareName, this.client.getUrl(), shareAclConverted, timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Retrieves statistics related to the share.
     *
     * @param shareName The name of the target share.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesGetStatisticsResponse> getStatisticsWithRestResponseAsync(String shareName, Context context) {
        final Integer timeout = null;
        final String restype = "share";
        final String comp = "stats";
        return service.getStatistics(shareName, this.client.getUrl(), timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Retrieves statistics related to the share.
     *
     * @param shareName The name of the target share.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SharesGetStatisticsResponse> getStatisticsWithRestResponseAsync(String shareName, Integer timeout, Context context) {
        final String restype = "share";
        final String comp = "stats";
        return service.getStatistics(shareName, this.client.getUrl(), timeout, this.client.getVersion(), restype, comp, context);
    }
}
