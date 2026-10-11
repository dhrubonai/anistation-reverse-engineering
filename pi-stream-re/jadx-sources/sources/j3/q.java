package j3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import m3.a1;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class q extends a1 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6073y = 0;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6074u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6075v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f6076w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x f6077x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, View view) {
        super(view);
        this.f6077x = xVar;
        if (f1.b0.f3799a < 26) {
            view.setFocusable(true);
        }
        this.f6074u = (TextView) view.findViewById(R.id.exo_main_text);
        this.f6075v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f6076w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new j(this, 1));
    }
}
