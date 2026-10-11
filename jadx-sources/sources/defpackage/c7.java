package defpackage;

import android.os.Build;
import com.discord.org.webrtc.EglBase10Impl;
import com.discord.org.webrtc.EglBase14Impl;
import com.discord.socialsdk.NativeCalls;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ byte x;

    public /* synthetic */ c7(byte b) {
        this.x = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.x) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                f44 f44Var = oa.i1;
                synchronized (f44Var) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = f44Var.a;
                        int i3 = f44Var.b;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                oa oaVar = (oa) objArr[i4];
                                boolean showLayoutBounds = oaVar.getShowLayoutBounds();
                                Class cls = oa.f1;
                                oaVar.setShowLayoutBounds(a34.b0());
                                if (showLayoutBounds != oaVar.getShowLayoutBounds()) {
                                    oaVar.post(new ea(oaVar, (byte) 2));
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                oa oaVar2 = (oa) objArr[i4];
                                oaVar2.post(new ea(oaVar2, (byte) 3));
                                i4++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                EglBase10Impl.EglConnection.lambda$new$1();
                return;
            case 3:
                EglBase14Impl.EglConnection.lambda$new$1();
                return;
            case 4:
                NativeCalls.lambda$stopForegroundService$4();
                return;
            case 5:
                NativeCalls.lambda$startForegroundService$3();
                return;
            default:
                return;
        }
    }

    private final void a() {
    }
}
