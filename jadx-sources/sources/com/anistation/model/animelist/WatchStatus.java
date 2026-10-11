package com.anistation.model.animelist;

import defpackage.bx7;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.mz6;
import defpackage.q71;
import defpackage.rb3;
import defpackage.sv1;
import defpackage.t80;
import defpackage.uv1;
import defpackage.x73;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class WatchStatus {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ WatchStatus[] $VALUES;
    private static final rb3 $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String exportValue;
    private final String label;
    public static final WatchStatus WATCHING = new WatchStatus("WATCHING", 0, "Watching", "Watching");
    public static final WatchStatus PLAN_TO_WATCH = new WatchStatus("PLAN_TO_WATCH", 1, "Plan to watch", "Plan to Watch");
    public static final WatchStatus COMPLETED = new WatchStatus("COMPLETED", 2, "Completed", "Completed");
    public static final WatchStatus ON_HOLD = new WatchStatus("ON_HOLD", 3, "On hold", "On-Hold");
    public static final WatchStatus DROPPED = new WatchStatus("DROPPED", 4, "Dropped", "Dropped");
    public static final WatchStatus REWATCHING = new WatchStatus("REWATCHING", 5, "Rewatching", "Watching");

    private static final /* synthetic */ WatchStatus[] $values() {
        return new WatchStatus[]{WATCHING, PLAN_TO_WATCH, COMPLETED, ON_HOLD, DROPPED, REWATCHING};
    }

    static {
        WatchStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = bx7.B(jf3.y, new mz6((byte) 3));
    }

    private WatchStatus(String str, int i, String str2, String str3) {
        this.label = str2;
        this.exportValue = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x73 _init_$_anonymous_() {
        WatchStatus[] values = values();
        values.getClass();
        return new uv1("com.anistation.model.animelist.WatchStatus", values);
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static WatchStatus valueOf(String str) {
        return (WatchStatus) Enum.valueOf(WatchStatus.class, str);
    }

    public static WatchStatus[] values() {
        return (WatchStatus[]) $VALUES.clone();
    }

    public final String getExportValue() {
        return this.exportValue;
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
            return (x73) WatchStatus.$cachedSerializer$delegate.getValue();
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
