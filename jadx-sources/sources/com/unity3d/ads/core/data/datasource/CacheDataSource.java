package com.unity3d.ads.core.data.datasource;

import defpackage.jc2;
import defpackage.ov3;
import defpackage.vz0;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface CacheDataSource {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, int i, jc2 jc2Var, vz0 vz0Var, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str2 = null;
                }
                if ((i2 & 8) != 0) {
                    num = Integer.MAX_VALUE;
                }
                if ((i2 & 16) != 0) {
                    i = Integer.MAX_VALUE;
                }
                if ((i2 & 32) != 0) {
                    jc2Var = null;
                }
                return cacheDataSource.getFile(file, str, str2, num, i, jc2Var, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: getFile");
            return null;
        }
    }

    Object getFile(File file, String str, String str2, Integer num, int i, jc2 jc2Var, vz0 vz0Var);
}
