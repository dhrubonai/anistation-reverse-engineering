package m1;

import android.os.Handler;
import android.os.Message;
import f1.b0;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class t implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final z1.d f7134a;

    /* renamed from: b, reason: collision with root package name */
    public final f f7135b;

    /* renamed from: f, reason: collision with root package name */
    public n1.c f7139f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7140x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7141y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7142z;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f7138e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f7137d = b0.l(this);

    /* renamed from: c, reason: collision with root package name */
    public final m2.b f7136c = new m2.b(1);

    public t(n1.c cVar, f fVar, z1.d dVar) {
        this.f7139f = cVar;
        this.f7135b = fVar;
        this.f7134a = dVar;
    }

    public final s a() {
        return new s(this, this.f7134a);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f7142z) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        r rVar = (r) message.obj;
        long j4 = rVar.f7127a;
        TreeMap treeMap = this.f7138e;
        long j10 = rVar.f7128b;
        Long l10 = (Long) treeMap.get(Long.valueOf(j10));
        if (l10 == null) {
            treeMap.put(Long.valueOf(j10), Long.valueOf(j4));
        } else if (l10.longValue() > j4) {
            treeMap.put(Long.valueOf(j10), Long.valueOf(j4));
        }
        return true;
    }
}
