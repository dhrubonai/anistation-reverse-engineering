package com.unity3d.ads.injection;

import defpackage.a34;
import defpackage.ot1;
import defpackage.rb3;
import defpackage.sb2;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.vn3;
import defpackage.x44;
import defpackage.ze0;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class Registry {
    private final x44 _services = tx5.a(ot1.x);

    public static EntryKey factory$default(Registry registry, String str, sb2 sb2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        sb2Var.getClass();
        a34.r0();
        throw null;
    }

    public static Object get$default(Registry registry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        a34.r0();
        throw null;
    }

    public static Object getOrNull$default(Registry registry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        a34.r0();
        throw null;
    }

    public static EntryKey single$default(Registry registry, String str, sb2 sb2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        sb2Var.getClass();
        a34.r0();
        throw null;
    }

    public final <T> void add(EntryKey entryKey, rb3 rb3Var) {
        sx5 sx5Var;
        Object value;
        Map singletonMap;
        entryKey.getClass();
        rb3Var.getClass();
        if (!getServices().containsKey(entryKey)) {
            x44 x44Var = this._services;
            do {
                sx5Var = (sx5) x44Var;
                value = sx5Var.getValue();
                singletonMap = Collections.singletonMap(entryKey, rb3Var);
                singletonMap.getClass();
            } while (!sx5Var.j(value, vn3.V((Map) value, singletonMap)));
            return;
        }
        ze0.m("Cannot have identical entries.");
    }

    public final <T> EntryKey factory(String str, sb2 sb2Var) {
        str.getClass();
        sb2Var.getClass();
        a34.r0();
        throw null;
    }

    public final <T> T get(String str) {
        str.getClass();
        a34.r0();
        throw null;
    }

    public final <T> T getOrNull(String str) {
        str.getClass();
        a34.r0();
        throw null;
    }

    public final Map<EntryKey, rb3> getServices() {
        return (Map) ((sx5) this._services).getValue();
    }

    public final <T> EntryKey single(String str, sb2 sb2Var) {
        str.getClass();
        sb2Var.getClass();
        a34.r0();
        throw null;
    }
}
