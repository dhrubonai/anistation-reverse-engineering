package com.unity3d.services.core.di;

import defpackage.a34;
import defpackage.e73;
import defpackage.im0;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ServiceKey {
    private final e73 instanceClass;
    private final String named;

    public ServiceKey(String str, e73 e73Var) {
        str.getClass();
        e73Var.getClass();
        this.named = str;
        this.instanceClass = e73Var;
    }

    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, e73 e73Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i & 2) != 0) {
            e73Var = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, e73Var);
    }

    public final String component1() {
        return this.named;
    }

    public final e73 component2() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String str, e73 e73Var) {
        str.getClass();
        e73Var.getClass();
        return new ServiceKey(str, e73Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        if (a34.i(this.named, serviceKey.named) && a34.i(this.instanceClass, serviceKey.instanceClass)) {
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
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ ServiceKey(String str, e73 e73Var, int i, q71 q71Var) {
        this((i & 1) != 0 ? "" : str, e73Var);
    }
}
