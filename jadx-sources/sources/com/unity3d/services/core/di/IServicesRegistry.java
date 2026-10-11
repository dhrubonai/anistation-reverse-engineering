package com.unity3d.services.core.di;

import defpackage.e73;
import defpackage.ov3;
import defpackage.rb3;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface IServicesRegistry {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, e73 e73Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                return iServicesRegistry.getService(str, e73Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: getService");
            return null;
        }
    }

    <T> T getService(String str, e73 e73Var);

    Map<ServiceKey, rb3> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, rb3 rb3Var);
}
