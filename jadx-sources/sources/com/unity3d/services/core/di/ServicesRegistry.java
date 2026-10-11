package com.unity3d.services.core.di;

import defpackage.a34;
import defpackage.e73;
import defpackage.ov3;
import defpackage.rb3;
import defpackage.sb2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, rb3> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String str, sb2 sb2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        sb2Var.getClass();
        a34.r0();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        a34.r0();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        a34.r0();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String str, sb2 sb2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        sb2Var.getClass();
        a34.r0();
        throw null;
    }

    public final <T> ServiceKey factory(String str, sb2 sb2Var) {
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

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(String str, e73 e73Var) {
        str.getClass();
        e73Var.getClass();
        return (T) resolveService(new ServiceKey(str, e73Var));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public Map<ServiceKey, rb3> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(ServiceKey serviceKey) {
        serviceKey.getClass();
        rb3 rb3Var = getServices().get(serviceKey);
        if (rb3Var != null) {
            return (T) rb3Var.getValue();
        }
        ov3.p(serviceKey, "No service instance found for ");
        return null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveServiceOrNull(ServiceKey serviceKey) {
        serviceKey.getClass();
        rb3 rb3Var = getServices().get(serviceKey);
        if (rb3Var == null) {
            return null;
        }
        return (T) rb3Var.getValue();
    }

    public final <T> ServiceKey single(String str, sb2 sb2Var) {
        str.getClass();
        sb2Var.getClass();
        a34.r0();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(ServiceKey serviceKey, rb3 rb3Var) {
        serviceKey.getClass();
        rb3Var.getClass();
        if (!getServices().containsKey(serviceKey)) {
            this._services.put(serviceKey, rb3Var);
        } else {
            ov3.l(serviceKey, "Cannot have multiple identical services: ");
        }
    }
}
