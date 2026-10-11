package defpackage;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zp4 extends t36 implements ic2 {
    public final /* synthetic */ SurfaceView x;
    public final /* synthetic */ w44 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp4(SurfaceView surfaceView, w44 w44Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = surfaceView;
        this.y = w44Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new zp4(this.x, this.y, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        zp4 zp4Var = (zp4) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        zp4Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        SurfaceView surfaceView = this.x;
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl != null) {
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            if (surfaceSyncGroup.add(rootSurfaceControl, new c7((byte) 6))) {
                this.y.setValue(surfaceSyncGroup);
                surfaceView.invalidate();
                rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
            } else {
                ze0.m("Failed to add rootSurfaceControl to SurfaceSyncGroup");
                return null;
            }
        }
        return pn6.a;
    }
}
