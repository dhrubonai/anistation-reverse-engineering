package com.anistation.model.download;

import defpackage.bx7;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.q71;
import defpackage.rb3;
import defpackage.sv1;
import defpackage.t80;
import defpackage.uv1;
import defpackage.vj1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class DownloadStorageType extends Enum<DownloadStorageType> {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ DownloadStorageType[] $VALUES;
    private static final rb3 $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final DownloadStorageType INTERNAL = new DownloadStorageType("INTERNAL", 0);
    public static final DownloadStorageType EXTERNAL = new DownloadStorageType("EXTERNAL", 1);

    private static final /* synthetic */ DownloadStorageType[] $values() {
        return new DownloadStorageType[]{INTERNAL, EXTERNAL};
    }

    static {
        DownloadStorageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = bx7.B(jf3.y, new vj1((byte) 5));
    }

    private DownloadStorageType(String str, int i) {
        super(str, i);
    }

    public static final x73 _init_$_anonymous_() {
        DownloadStorageType[] values = values();
        values.getClass();
        return new uv1("com.anistation.model.download.DownloadStorageType", values);
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static DownloadStorageType valueOf(String str) {
        return (DownloadStorageType) Enum.valueOf(DownloadStorageType.class, str);
    }

    public static DownloadStorageType[] values() {
        return (DownloadStorageType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) DownloadStorageType.$cachedSerializer$delegate.getValue();
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
