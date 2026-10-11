package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public Object f551a;

    /* renamed from: b, reason: collision with root package name */
    public Object f552b;

    /* renamed from: c, reason: collision with root package name */
    public Object f553c;

    /* renamed from: d, reason: collision with root package name */
    public Object f554d;

    /* renamed from: e, reason: collision with root package name */
    public Object f555e;

    /* renamed from: f, reason: collision with root package name */
    public Object f556f;

    /* renamed from: g, reason: collision with root package name */
    public Object f557g;

    public k4(Context context) {
        this.f554d = new WindowManager.LayoutParams();
        this.f555e = new Rect();
        this.f556f = new int[2];
        this.f557g = new int[2];
        this.f551a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f552b = inflate;
        this.f553c = (TextView) inflate.findViewById(R.id.message);
        ((WindowManager.LayoutParams) this.f554d).setTitle(k4.class.getSimpleName());
        ((WindowManager.LayoutParams) this.f554d).packageName = ((Context) this.f551a).getPackageName();
        Object obj = this.f554d;
        ((WindowManager.LayoutParams) obj).type = 1002;
        ((WindowManager.LayoutParams) obj).width = -2;
        ((WindowManager.LayoutParams) obj).height = -2;
        ((WindowManager.LayoutParams) obj).format = -3;
        ((WindowManager.LayoutParams) obj).windowAnimations = R.style.Animation_AppCompat_Tooltip;
        ((WindowManager.LayoutParams) obj).flags = 24;
    }

    public k4(a4.c cVar, a4.c cVar2, a4.c cVar3, a4.c cVar4, x3.v vVar, x3.x xVar) {
        this.f557g = q6.g.o0(150, new k3.d(this, 5));
        this.f551a = cVar;
        this.f552b = cVar2;
        this.f553c = cVar3;
        this.f554d = cVar4;
        this.f555e = vVar;
        this.f556f = xVar;
    }
}
