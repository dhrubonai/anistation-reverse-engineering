package h8;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import l8.m0;
import m8.v0;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5113d;

    public /* synthetic */ v(Object obj, int i10, Object obj2, int i11) {
        this.f5110a = i11;
        this.f5112c = obj;
        this.f5111b = i10;
        this.f5113d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [m8.v] */
    /* JADX WARN: Type inference failed for: r5v2, types: [m8.v] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l8.a0 a0Var;
        int i10 = this.f5111b;
        int i11 = this.f5110a;
        Object obj = this.f5113d;
        Object obj2 = this.f5112c;
        switch (i11) {
            case 0:
                x xVar = (x) obj2;
                xVar.f5123d = i10;
                xVar.h((List) obj);
                xVar.i();
                return;
            case 1:
                ((i8.f) obj2).f5434d = i10;
                ((Runnable) obj).run();
                return;
            case 2:
                l8.d0 d0Var = (l8.d0) obj2;
                int i12 = l8.d0.f6908v0;
                d0Var.getClass();
                d0Var.f6916u0 = ((String[]) obj)[i10];
                d0Var.X();
                if ((d0Var.d() instanceof MainActivity) && (a0Var = ((MainActivity) d0Var.d()).I) != null) {
                    a0Var.post(new m0(a0Var, 3));
                    return;
                }
                return;
            case 3:
                final l8.z zVar = (l8.z) obj2;
                final Context context = (Context) obj;
                final int i13 = 0;
                zVar.l("History limit", new int[]{5, 10, 15, 20, 30}, " searches", i10, new IntConsumer() { // from class: m8.v
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i14) {
                        switch (i13) {
                            case 0:
                                Context context2 = context;
                                l8.z zVar2 = (l8.z) zVar;
                                com.bumptech.glide.c.b0(context2).edit().putInt("search_history_limit", i14).apply();
                                MainActivity mainActivity = zVar2.f7036b;
                                ArrayList e10 = r6.h0.e(mainActivity);
                                int i15 = com.bumptech.glide.c.b0(mainActivity).getInt("search_history_limit", 10);
                                if (e10.size() > i15) {
                                    r6.h0.C0(mainActivity, e10.subList(0, i15));
                                }
                                zVar2.f();
                                return;
                            default:
                                Context context3 = context;
                                l8.z zVar3 = (l8.z) zVar;
                                com.bumptech.glide.c.b0(context3).edit().putInt("player_seek_duration_ms", i14 * 1000).apply();
                                zVar3.f();
                                return;
                        }
                    }
                });
                return;
            case 4:
                final l8.z zVar2 = (l8.z) obj2;
                final Context context2 = (Context) obj;
                final int i14 = 1;
                zVar2.l("Skip duration", new int[]{5, 10, 15, 20, 30}, " seconds", i10, new IntConsumer() { // from class: m8.v
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i142) {
                        switch (i14) {
                            case 0:
                                Context context22 = context2;
                                l8.z zVar22 = (l8.z) zVar2;
                                com.bumptech.glide.c.b0(context22).edit().putInt("search_history_limit", i142).apply();
                                MainActivity mainActivity = zVar22.f7036b;
                                ArrayList e10 = r6.h0.e(mainActivity);
                                int i15 = com.bumptech.glide.c.b0(mainActivity).getInt("search_history_limit", 10);
                                if (e10.size() > i15) {
                                    r6.h0.C0(mainActivity, e10.subList(0, i15));
                                }
                                zVar22.f();
                                return;
                            default:
                                Context context3 = context2;
                                l8.z zVar3 = (l8.z) zVar2;
                                com.bumptech.glide.c.b0(context3).edit().putInt("player_seek_duration_ms", i142 * 1000).apply();
                                zVar3.f();
                                return;
                        }
                    }
                });
                return;
            case 5:
                int[] iArr = v0.f7722a;
                com.bumptech.glide.c.b0((Context) obj2).edit().putInt("subtitle_font_style", i10).apply();
                ((Runnable) obj).run();
                return;
            default:
                n8.a aVar = (n8.a) ((f8.h) obj2).f3961a;
                aVar.f8024b.f7772w0 = i10;
                aVar.u();
                ((PopupWindow) obj).dismiss();
                return;
        }
    }

    public /* synthetic */ v(l8.d0 d0Var, String[] strArr, int i10) {
        this.f5110a = 2;
        this.f5112c = d0Var;
        this.f5113d = strArr;
        this.f5111b = i10;
    }
}
