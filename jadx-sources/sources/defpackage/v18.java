package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v18 extends jt3 {
    public final /* synthetic */ a58 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v18(a58 a58Var) {
        super((byte) 1);
        Objects.requireNonNull(a58Var);
        this.f = a58Var;
    }

    @Override // defpackage.jt3
    public final void E() {
        a58.v.b("onSkipToNext", new Object[0]);
        s25 s25Var = this.f.n;
        if (s25Var != null) {
            a34.s();
            if (!s25Var.x()) {
                s25.w();
            } else {
                s25.z(new sf7(s25Var, (byte) 1, false));
            }
        }
    }

    @Override // defpackage.jt3
    public final void H() {
        a58.v.b("onSkipToPrevious", new Object[0]);
        s25 s25Var = this.f.n;
        if (s25Var != null) {
            a34.s();
            if (!s25Var.x()) {
                s25.w();
            } else {
                s25.z(new sf7(s25Var, (byte) 0, false));
            }
        }
    }

    @Override // defpackage.jt3
    public final void d(String str) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        a58.v.b("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        a58 a58Var = this.f;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j = -a58Var.e.z;
                    s25 s25Var = a58Var.n;
                    if (s25Var != null) {
                        long min = Math.min(s25Var.g(), Math.max(0L, s25Var.a() + j));
                        s25 s25Var2 = a58Var.n;
                        if (s25Var2 == null) {
                            return;
                        }
                        xs3 xs3Var = new xs3(min);
                        a34.s();
                        if (!s25Var2.x()) {
                            s25.w();
                            return;
                        } else {
                            s25.z(new ek7(s25Var2, xs3Var, (byte) 1));
                            return;
                        }
                    }
                    return;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    pk5 pk5Var = a58Var.d;
                    if (pk5Var != null) {
                        pk5Var.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    pk5 pk5Var2 = a58Var.d;
                    if (pk5Var2 != null) {
                        pk5Var2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j2 = a58Var.e.z;
                    s25 s25Var3 = a58Var.n;
                    if (s25Var3 != null) {
                        long min2 = Math.min(s25Var3.g(), Math.max(0L, s25Var3.a() + j2));
                        s25 s25Var4 = a58Var.n;
                        if (s25Var4 != null) {
                            xs3 xs3Var2 = new xs3(min2);
                            a34.s();
                            if (!s25Var4.x()) {
                                s25.w();
                                return;
                            } else {
                                s25.z(new ek7(s25Var4, xs3Var2, (byte) 1));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(a58Var.g);
        int i = Build.VERSION.SDK_INT;
        Context context = a58Var.a;
        if (i >= 34) {
            makeBasic = BroadcastOptions.makeBasic();
            shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
            bundle = shareIdentityEnabled.toBundle();
            context.sendBroadcast(intent, null, bundle);
            return;
        }
        context.sendBroadcast(intent);
    }

    @Override // defpackage.jt3
    public final boolean g(Intent intent) {
        s25 s25Var;
        a58.v.b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (s25Var = this.f.n) != null) {
                s25Var.q();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.jt3
    public final void h() {
        a58.v.b("onPause", new Object[0]);
        s25 s25Var = this.f.n;
        if (s25Var != null) {
            s25Var.q();
        }
    }

    @Override // defpackage.jt3
    public final void k() {
        a58.v.b("onPlay", new Object[0]);
        s25 s25Var = this.f.n;
        if (s25Var != null) {
            s25Var.q();
        }
    }

    @Override // defpackage.jt3
    public final void w(long j) {
        zk3 zk3Var = a58.v;
        a58.v.b("onSeekTo %d", Long.valueOf(j));
        s25 s25Var = this.f.n;
        if (s25Var == null) {
            return;
        }
        xs3 xs3Var = new xs3(j);
        a34.s();
        if (!s25Var.x()) {
            s25.w();
        } else {
            s25.z(new ek7(s25Var, xs3Var, (byte) 1));
        }
    }
}
