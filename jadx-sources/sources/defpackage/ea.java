package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ oa y;

    public /* synthetic */ ea(oa oaVar, byte b) {
        this.x = b;
        this.y = oaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        oa oaVar = this.y;
        switch (b) {
            case 0:
                bs bsVar = oaVar.F;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!bsVar.isEmpty()) {
                    try {
                        ((sb2) bsVar.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                oaVar.U0 = false;
                MotionEvent motionEvent = oaVar.K0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    oaVar.F(motionEvent);
                    return;
                } else {
                    ze0.m("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                oa.i(oaVar.getRoot());
                return;
            default:
                oa.i(oaVar.getRoot());
                return;
        }
    }
}
