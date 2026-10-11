package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import defpackage.d46;
import defpackage.db;
import defpackage.jc2;
import defpackage.la4;
import defpackage.n11;
import defpackage.pn6;
import defpackage.r11;
import defpackage.rb3;
import defpackage.sb2;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import java.io.File;
import org.json.JSONArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidCacheRepository implements CacheRepository {
    private final rb3 cacheDir$delegate;
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final CreateFile createFile;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetAssetFileName getAssetFileName;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final CacheDataSource remoteCacheDataSource;
    private final v11 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final rb3 webviewCacheDir$delegate;

    public AndroidCacheRepository(n11 n11Var, GetCacheDirectory getCacheDirectory, CacheDataSource cacheDataSource, CacheDataSource cacheDataSource2, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue, CreateFile createFile, SendDiagnosticEvent sendDiagnosticEvent, GetAssetFileName getAssetFileName) {
        n11Var.getClass();
        getCacheDirectory.getClass();
        cacheDataSource.getClass();
        cacheDataSource2.getClass();
        context.getClass();
        sessionRepository.getClass();
        cleanupDirectory.getClass();
        downloadPriorityQueue.getClass();
        createFile.getClass();
        sendDiagnosticEvent.getClass();
        getAssetFileName.getClass();
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = cacheDataSource;
        this.remoteCacheDataSource = cacheDataSource2;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getAssetFileName = getAssetFileName;
        this.scope = db.g0(db.g0(db.b(n11Var), new r11("CacheRepository")), la4.x);
        final byte b = 0;
        this.cacheDir$delegate = new d46(new sb2(this) { // from class: s9
            public final /* synthetic */ AndroidCacheRepository y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                File initCacheDir;
                File initCacheDir2;
                byte b2 = b;
                AndroidCacheRepository androidCacheRepository = this.y;
                switch (b2) {
                    case 0:
                        initCacheDir = androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
                        return initCacheDir;
                    default:
                        initCacheDir2 = androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
                        return initCacheDir2;
                }
            }
        });
        final byte b2 = 1;
        this.webviewCacheDir$delegate = new d46(new sb2(this) { // from class: s9
            public final /* synthetic */ AndroidCacheRepository y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                File initCacheDir;
                File initCacheDir2;
                byte b22 = b2;
                AndroidCacheRepository androidCacheRepository = this.y;
                switch (b22) {
                    case 0:
                        initCacheDir = androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
                        return initCacheDir;
                    default:
                        initCacheDir2 = androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
                        return initCacheDir2;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDir() {
        return (File) this.cacheDir$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileFromRemote(File file, String str, vz0 vz0Var) {
        return tl7.V(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFileFromRemote$2(this, str, file, null), vz0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i, int i2, jc2 jc2Var, vz0 vz0Var) {
        return tl7.V(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFileInternal$2(this, str, file, i, i2, jc2Var, null), vz0Var);
    }

    public static /* synthetic */ Object getFileInternal$default(AndroidCacheRepository androidCacheRepository, File file, String str, JSONArray jSONArray, int i, int i2, jc2 jc2Var, vz0 vz0Var, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            jc2Var = null;
        }
        return androidCacheRepository.getFileInternal(file, str, jSONArray, i, i4, jc2Var, vz0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getWebviewCacheDir() {
        return (File) this.webviewCacheDir$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File initCacheDir(String str) {
        File cacheDir;
        boolean useFilesDir = this.sessionRepository.getFeatureFlags().getUseFilesDir();
        Context context = this.context;
        if (useFilesDir) {
            cacheDir = context.getFilesDir();
        } else {
            cacheDir = context.getCacheDir();
        }
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        cacheDir.getClass();
        File invoke = getCacheDirectory.invoke(cacheDir, str);
        invoke.mkdirs();
        return invoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(vz0 vz0Var) {
        Object V = tl7.V(this.scope.getCoroutineContext(), new AndroidCacheRepository$clearCache$2(this, null), vz0Var);
        if (V == w11.x) {
            return V;
        }
        return pn6.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doesFileExist(java.lang.String r5, defpackage.vz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = (com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r6)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r6)
            r0.label = r2
            java.lang.Object r6 = r4.retrieveFile(r5, r0)
            w11 r4 = defpackage.w11.x
            if (r6 != r4) goto L3a
            return r4
        L3a:
            boolean r4 = r6 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist(java.lang.String, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(vz0 vz0Var) {
        return tl7.V(this.scope.getCoroutineContext(), new AndroidCacheRepository$getCacheSize$2(this, null), vz0Var);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, JSONArray jSONArray, int i, int i2, jc2 jc2Var, vz0 vz0Var) {
        return getFileInternal(getCacheDir(), str, jSONArray, i, i2, jc2Var, vz0Var);
    }

    public final String getFilename(String str) {
        str.getClass();
        return this.getAssetFileName.invoke(str);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFile(String str, String str2, boolean z, vz0 vz0Var) {
        File invoke = this.createFile.invoke(getWebviewCacheDir(), str2);
        invoke.mkdirs();
        if (z) {
            return getFileFromRemote(invoke, str, vz0Var);
        }
        return getFileInternal$default(this, invoke, str, null, 0, 0, null, vz0Var, 48, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFileFromDisk(String str, String str2, vz0 vz0Var) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.createFile.invoke(getWebviewCacheDir(), str2), getFilename(str), str, new Integer(0), 0, null, vz0Var, 48, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        cachedFile.getClass();
        File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
            return false;
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object retrieveFile(String str, vz0 vz0Var) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, getCacheDir(), str, null, null, 0, null, vz0Var, 60, null);
    }
}
