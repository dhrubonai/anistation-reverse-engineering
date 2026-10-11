package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.gj6;
import defpackage.h21;
import defpackage.si0;
import defpackage.vx;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class CctBackendFactory {
    public gj6 create(h21 h21Var) {
        Context context = ((vx) h21Var).a;
        vx vxVar = (vx) h21Var;
        return new si0(context, vxVar.b, vxVar.c);
    }
}
