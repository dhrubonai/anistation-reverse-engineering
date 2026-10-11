package b1;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f1277a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f1278b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1279c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1280d;

    public a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f1277a = intentFilter;
        this.f1278b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f1278b);
        sb.append(" filter=");
        sb.append(this.f1277a);
        if (this.f1280d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
