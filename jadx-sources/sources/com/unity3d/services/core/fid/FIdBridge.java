package com.unity3d.services.core.fid;

import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.reflection.GenericBridge;
import defpackage.hz5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FIdBridge extends GenericBridge {
    private final Object instance;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FIdBridge(java.lang.Object r4) {
        /*
            r3 = this;
            r4.getClass()
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.String r2 = "getAppInstanceId"
            java.util.Map r1 = java.util.Collections.singletonMap(r2, r1)
            r1.getClass()
            r3.<init>(r1, r0)
            r3.instance = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.fid.FIdBridge.<init>(java.lang.Object):void");
    }

    public final Task getAppInstanceId() {
        Task task = (Task) callNonVoidMethod(Constants.GET_APP_INSTANCE_ID, this.instance, new Object[0]);
        if (task == null) {
            return hz5.e(null);
        }
        return task;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.Companion.getClassName();
    }
}
