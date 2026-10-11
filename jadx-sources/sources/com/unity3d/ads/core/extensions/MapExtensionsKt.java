package com.unity3d.ads.core.extensions;

import defpackage.kl0;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MapExtensionsKt {
    public static final int sizeInKb(Map<String, String> map) {
        map.getClass();
        Iterator<T> it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Charset charset = kl0.a;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            int length = bytes.length;
            byte[] bytes2 = str2.getBytes(charset);
            bytes2.getClass();
            i += length + bytes2.length;
        }
        return i / 1024;
    }
}
