package com.unity3d.ads.core.data.datasource;

import defpackage.ic2;
import defpackage.jc2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2", f = "AndroidRemoteCacheDataSource.kt", l = {78, 79, 132}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidRemoteCacheDataSource$getFileInternal$2 extends t36 implements ic2 {
    final /* synthetic */ File $cachePath;
    final /* synthetic */ String $fileName;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ jc2 $onProgress;
    final /* synthetic */ Integer $priority;
    final /* synthetic */ String $url;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ AndroidRemoteCacheDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRemoteCacheDataSource$getFileInternal$2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, int i, jc2 jc2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.$url = str;
        this.this$0 = androidRemoteCacheDataSource;
        this.$cachePath = file;
        this.$fileName = str2;
        this.$priority = num;
        this.$intervalMs = i;
        this.$onProgress = jc2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidRemoteCacheDataSource$getFileInternal$2 androidRemoteCacheDataSource$getFileInternal$2 = new AndroidRemoteCacheDataSource$getFileInternal$2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, this.$intervalMs, this.$onProgress, vz0Var);
        androidRemoteCacheDataSource$getFileInternal$2.L$0 = obj;
        return androidRemoteCacheDataSource$getFileInternal$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidRemoteCacheDataSource$getFileInternal$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0688, code lost:
    
        return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x05dd, code lost:
    
        r3 = new java.io.File(r47.$cachePath, r47.$fileName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x05ea, code lost:
    
        if (r3.exists() != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x05fa, code lost:
    
        throw new java.lang.IllegalStateException("Final file exists and could not be deleted before overwriting");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0601, code lost:
    
        if (r12.renameTo(r3) != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0607, code lost:
    
        if (r7.exists() != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0617, code lost:
    
        throw new java.lang.IllegalStateException("Could not delete Etag file after successful download");
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0628, code lost:
    
        r0 = defpackage.z45.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x062c, code lost:
    
        if (r0 != null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0637, code lost:
    
        return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.FILE_STATE_WRONG, com.unity3d.ads.core.data.model.CacheSource.REMOTE, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0638, code lost:
    
        r0 = r47.$url;
        r4 = r47.$fileName;
        r5 = r47.this$0.getFileExtensionFromUrl;
        r5 = r5.invoke(r47.$url);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x064a, code lost:
    
        if (r5 == null) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x064c, code lost:
    
        r27 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0651, code lost:
    
        r7 = r2.x;
        r30 = r6.getProtocol();
        r1 = r47.$priority;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x065a, code lost:
    
        if (r1 != null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x065c, code lost:
    
        r31 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x067b, code lost:
    
        return new com.unity3d.ads.core.data.model.CacheResult.Success(new com.unity3d.ads.core.data.model.CachedFile(r0, r4, r3, r27, r7, r30, r31), com.unity3d.ads.core.data.model.CacheSource.REMOTE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x066b, code lost:
    
        r31 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x064f, code lost:
    
        r27 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0622, code lost:
    
        throw new java.lang.IllegalStateException("Could not rename temporary file to final file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x05fb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0623, code lost:
    
        r4 = new defpackage.y45(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04b7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04b8, code lost:
    
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04bb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04bc, code lost:
    
        r31 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04bf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04c0, code lost:
    
        r31 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04c5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04c6, code lost:
    
        r29 = r2;
        r31 = r6;
        r4 = r27;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0516, code lost:
    
        r29 = r2;
        r31 = r6;
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x051e, code lost:
    
        defpackage.a34.C(r27, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0521, code lost:
    
        defpackage.a34.C(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0524, code lost:
    
        defpackage.a34.C(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0527, code lost:
    
        r3 = r20;
        r10 = r25;
        r2 = r29;
        r6 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0531, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0532, code lost:
    
        r10 = r25;
        r2 = r29;
        r6 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x053a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x053b, code lost:
    
        r2 = r0;
        r4 = r7;
        r8 = r12;
        r10 = r25;
        r15 = r29;
        r12 = r31;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0546, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0547, code lost:
    
        r4 = r7;
        r8 = r12;
        r10 = r25;
        r15 = r29;
        r12 = r31;
        r7 = r3;
        r3 = r2;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02e7, code lost:
    
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0400, code lost:
    
        r13 = new java.lang.Long(r25 + r2.x);
        r11 = r14;
        r13 = r43;
        r10 = new java.lang.Long(r13);
        r47.L$0 = r5;
        r47.L$1 = r12;
        r47.L$2 = r7;
        r47.L$3 = r6;
        r47.L$4 = r2;
        r47.L$5 = r4;
        r47.L$6 = r0;
        r47.L$7 = r3;
        r47.L$8 = r9;
        r47.L$9 = r11;
        r47.L$10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0425, code lost:
    
        r29 = r2;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0429, code lost:
    
        r47.L$11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x042b, code lost:
    
        r30 = r4;
        r4 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x042f, code lost:
    
        r47.L$12 = r4;
        r47.L$13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0433, code lost:
    
        r27 = r5;
        r31 = r6;
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0439, code lost:
    
        r47.J$0 = r5;
        r47.J$1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x043d, code lost:
    
        r25 = r5;
        r5 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0441, code lost:
    
        r47.I$0 = r5;
        r47.label = 3;
        r6 = r0.invoke(r13, r10, r47);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x044c, code lost:
    
        r10 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x044e, code lost:
    
        if (r6 != r10) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0451, code lost:
    
        r23 = r3;
        r43 = r13;
        r48 = r29;
        r6 = r31;
        r13 = r5;
        r14 = r11;
        r5 = r27;
        r11 = r4;
        r27 = r12;
        r4 = r30;
        r12 = r2;
        r9 = r9;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04a5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x05a7, code lost:
    
        return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05ae, code lost:
    
        if (r6.getStatusCode() != 206) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0516 A[EDGE_INSN: B:171:0x0516->B:172:0x0516 BREAK  A[LOOP:0: B:17:0x03cc->B:35:0x04f8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05a8  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, v05] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, u05] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, u05] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v6, types: [u05] */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v24, types: [cb0] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0451 -> B:10:0x0463). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
