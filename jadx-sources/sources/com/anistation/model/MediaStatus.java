package com.anistation.model;

import defpackage.bx7;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.q71;
import defpackage.rb3;
import defpackage.sv1;
import defpackage.t53;
import defpackage.t80;
import defpackage.uv1;
import defpackage.x73;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class MediaStatus {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ MediaStatus[] $VALUES;
    private static final rb3 $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String label;
    public static final MediaStatus FINISHED = new MediaStatus("FINISHED", 0, "Completed");
    public static final MediaStatus RELEASING = new MediaStatus("RELEASING", 1, "Airing");
    public static final MediaStatus NOT_YET_RELEASED = new MediaStatus("NOT_YET_RELEASED", 2, "Not Yet Released");
    public static final MediaStatus CANCELLED = new MediaStatus("CANCELLED", 3, "Cancelled");
    public static final MediaStatus HIATUS = new MediaStatus("HIATUS", 4, "Hiatus");
    public static final MediaStatus UNKNOWN = new MediaStatus("UNKNOWN", 5, "Unknown");

    private static final /* synthetic */ MediaStatus[] $values() {
        return new MediaStatus[]{FINISHED, RELEASING, NOT_YET_RELEASED, CANCELLED, HIATUS, UNKNOWN};
    }

    static {
        MediaStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = bx7.B(jf3.y, new t53((byte) 22));
    }

    private MediaStatus(String str, int i, String str2) {
        this.label = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x73 _init_$_anonymous_() {
        MediaStatus[] values = values();
        values.getClass();
        return new uv1("com.anistation.model.MediaStatus", values);
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static MediaStatus valueOf(String str) {
        return (MediaStatus) Enum.valueOf(MediaStatus.class, str);
    }

    public static MediaStatus[] values() {
        return (MediaStatus[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) MediaStatus.$cachedSerializer$delegate.getValue();
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
