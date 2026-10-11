package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import defpackage.jc2;
import defpackage.n11;
import defpackage.tl7;
import defpackage.vz0;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClientProvider httpClientProvider;
    private final n11 ioDispatcher;
    private final SessionRepository sessionRepository;

    public AndroidRemoteCacheDataSource(n11 n11Var, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClientProvider httpClientProvider, SessionRepository sessionRepository) {
        n11Var.getClass();
        createFile.getClass();
        getFileExtensionFromUrl.getClass();
        httpClientProvider.getClass();
        sessionRepository.getClass();
        this.ioDispatcher = n11Var;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClientProvider = httpClientProvider;
        this.sessionRepository = sessionRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, String str2, Integer num, int i, jc2 jc2Var, vz0 vz0Var) {
        return tl7.V(this.ioDispatcher, new AndroidRemoteCacheDataSource$getFileInternal$2(str2, this, file, str, num, i, jc2Var, null), vz0Var);
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, int i, jc2 jc2Var, vz0 vz0Var) {
        return getFileInternal(file, str, str2, num, i, jc2Var, vz0Var);
    }
}
