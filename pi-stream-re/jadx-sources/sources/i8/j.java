package i8;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import h8.r;
import java.util.ArrayList;
import m3.a1;
import m3.d0;
import m3.l0;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class j extends d0 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f5440d;

    /* renamed from: e, reason: collision with root package name */
    public final i f5441e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5442f = new ArrayList();

    public j(Context context, w.f fVar) {
        this.f5440d = context;
        this.f5441e = fVar;
    }

    @Override // m3.d0
    public final int a() {
        return this.f5442f.size();
    }

    @Override // m3.d0
    public final void c(a1 a1Var, int i10) {
        h hVar = (h) a1Var;
        a8.e eVar = (a8.e) this.f5442f.get(i10);
        hVar.f5439v.setText(eVar.f183a);
        ((com.bumptech.glide.l) com.bumptech.glide.b.d(this.f5440d).n(eVar.f185c).j()).x(hVar.f5438u);
        hVar.f7153a.setOnClickListener(new r(8, this, eVar));
    }

    @Override // m3.d0
    public final a1 d(RecyclerView recyclerView) {
        Context context = this.f5440d;
        FrameLayout frameLayout = new FrameLayout(context);
        l0 l0Var = new l0(w8.i.e(context, 150), w8.i.e(context, 113));
        l0Var.setMargins(0, 0, w8.i.e(context, 12), 0);
        frameLayout.setLayoutParams(l0Var);
        frameLayout.setBackground(w8.i.j(w8.i.f11063c, w8.i.e(context, 8)));
        w8.i.a(frameLayout);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.background_gradient_episode);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, w8.i.e(context, 40), 80));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_play_episode);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(imageView2, new FrameLayout.LayoutParams(w8.i.e(context, 38), w8.i.e(context, 38), 17));
        TextView l10 = w8.i.l(context, "", 12, -1, 0);
        l10.setMaxLines(1);
        l10.setIncludeFontPadding(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(w8.i.e(context, 12), 0, w8.i.e(context, 12), w8.i.e(context, 12));
        frameLayout.addView(l10, layoutParams);
        return new h(frameLayout, imageView, l10);
    }
}
