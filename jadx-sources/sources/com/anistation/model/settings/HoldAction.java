package com.anistation.model.settings;

import defpackage.a34;
import defpackage.q71;
import defpackage.sv1;
import defpackage.t80;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HoldAction {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ HoldAction[] $VALUES;
    public static final Companion Companion;
    public static final HoldAction FAST_FORWARD = new HoldAction("FAST_FORWARD", 0);
    public static final HoldAction PAUSE = new HoldAction("PAUSE", 1);

    private static final /* synthetic */ HoldAction[] $values() {
        return new HoldAction[]{FAST_FORWARD, PAUSE};
    }

    static {
        HoldAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
        Companion = new Companion(null);
    }

    private HoldAction(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static HoldAction valueOf(String str) {
        return (HoldAction) Enum.valueOf(HoldAction.class, str);
    }

    public static HoldAction[] values() {
        return (HoldAction[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final HoldAction fromStorageValue(String str) {
            Object obj;
            Iterator<E> it = HoldAction.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (a34.i(((HoldAction) obj).name(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            HoldAction holdAction = (HoldAction) obj;
            if (holdAction == null) {
                return HoldAction.FAST_FORWARD;
            }
            return holdAction;
        }

        private Companion() {
        }
    }
}
