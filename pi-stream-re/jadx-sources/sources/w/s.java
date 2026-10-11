package w;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10725a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f10729e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f10730f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f10731g;

    /* renamed from: h, reason: collision with root package name */
    public int f10732h;

    /* renamed from: j, reason: collision with root package name */
    public r f10734j;

    /* renamed from: k, reason: collision with root package name */
    public int f10735k;

    /* renamed from: l, reason: collision with root package name */
    public int f10736l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10737m;
    public Bundle o;

    /* renamed from: p, reason: collision with root package name */
    public String f10739p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f10740q;

    /* renamed from: r, reason: collision with root package name */
    public final Notification f10741r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f10742s;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10726b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10727c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10728d = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10733i = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10738n = false;

    public s(Context context, String str) {
        Notification notification = new Notification();
        this.f10741r = notification;
        this.f10725a = context;
        this.f10739p = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f10732h = 0;
        this.f10742s = new ArrayList();
        this.f10740q = true;
    }

    public static CharSequence c(String str) {
        if (str == null) {
            return str;
        }
        if (str.length() > 5120) {
            return str.subSequence(0, 5120);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bf  */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Notification a() {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.s.a():android.app.Notification");
    }

    public final Bundle b() {
        if (this.o == null) {
            this.o = new Bundle();
        }
        return this.o;
    }

    public final void d(int i10, boolean z9) {
        Notification notification = this.f10741r;
        if (z9) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void e(r rVar) {
        if (this.f10734j != rVar) {
            this.f10734j = rVar;
            if (((s) rVar.f10721a) != this) {
                rVar.f10721a = this;
                e(rVar);
            }
        }
    }
}
