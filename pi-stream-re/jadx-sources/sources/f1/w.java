package f1;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public Message f3864a;

    public final void a() {
        Message message = this.f3864a;
        message.getClass();
        message.sendToTarget();
        this.f3864a = null;
        ArrayList arrayList = x.f3865b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }
}
