package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import defpackage.a34;
import defpackage.ov3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class MetadataReader<T> {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage, String str) {
        jsonStorage.getClass();
        str.getClass();
        this.jsonStorage = jsonStorage;
        this.key = str;
    }

    public static Object read$default(MetadataReader metadataReader, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if (metadataReader.getJsonStorage().get(metadataReader.getKey()) == null) {
                return obj;
            }
            a34.r0();
            throw null;
        }
        ov3.g("Super calls with default arguments not supported in this target, function: read");
        return null;
    }

    public static Object readAndDelete$default(MetadataReader metadataReader, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if (metadataReader.getJsonStorage().get(metadataReader.getKey()) == null) {
                if (metadataReader.getJsonStorage().get(metadataReader.getKey()) != null) {
                    metadataReader.getJsonStorage().delete(metadataReader.getKey());
                }
                return obj;
            }
            a34.r0();
            throw null;
        }
        ov3.g("Super calls with default arguments not supported in this target, function: readAndDelete");
        return null;
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    public final <T> T read(T t) {
        if (getJsonStorage().get(getKey()) == null) {
            return t;
        }
        a34.r0();
        throw null;
    }

    public final <T> T readAndDelete(T t) {
        if (getJsonStorage().get(getKey()) == null) {
            if (getJsonStorage().get(getKey()) != null) {
                getJsonStorage().delete(getKey());
            }
            return t;
        }
        a34.r0();
        throw null;
    }
}
