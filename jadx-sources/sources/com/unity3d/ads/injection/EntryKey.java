package com.unity3d.ads.injection;

import defpackage.a34;
import defpackage.e73;
import defpackage.im0;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class EntryKey {
    private final e73 instanceClass;
    private final String named;

    public EntryKey(String str, e73 e73Var) {
        str.getClass();
        e73Var.getClass();
        this.named = str;
        this.instanceClass = e73Var;
    }

    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, e73 e73Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryKey.named;
        }
        if ((i & 2) != 0) {
            e73Var = entryKey.instanceClass;
        }
        return entryKey.copy(str, e73Var);
    }

    public final String component1() {
        return this.named;
    }

    public final e73 component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String str, e73 e73Var) {
        str.getClass();
        e73Var.getClass();
        return new EntryKey(str, e73Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        if (a34.i(this.named, entryKey.named) && a34.i(this.instanceClass, entryKey.instanceClass)) {
            return true;
        }
        return false;
    }

    public final e73 getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return ((im0) this.instanceClass).hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, e73 e73Var, int i, q71 q71Var) {
        this((i & 1) != 0 ? "" : str, e73Var);
    }
}
