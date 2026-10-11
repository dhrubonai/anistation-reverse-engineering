package i8;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import m3.a1;

/* loaded from: classes.dex */
public final class o extends a1 {
    public final TextView A;
    public final /* synthetic */ p B;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5462u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5463v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f5464w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f5465x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f5466y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f5467z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, FrameLayout frameLayout) {
        super(frameLayout);
        this.B = pVar;
        this.f5462u = (TextView) frameLayout.findViewWithTag("month");
        this.f5463v = (TextView) frameLayout.findViewWithTag("day");
        this.f5464w = (TextView) frameLayout.findViewWithTag("year");
        this.f5465x = (ImageView) frameLayout.findViewWithTag("poster");
        this.f5466y = (TextView) frameLayout.findViewWithTag("title");
        this.f5467z = (TextView) frameLayout.findViewWithTag("meta");
        this.A = (TextView) frameLayout.findViewWithTag("badge");
    }
}
