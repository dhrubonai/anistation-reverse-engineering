package m8;

import android.content.Context;
import android.util.Log;
import android.widget.PopupWindow;
import java.util.List;
import java.util.function.Consumer;
import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7653e;

    public /* synthetic */ l0(f8.h hVar, List list, int i10, PopupWindow popupWindow) {
        this.f7649a = 2;
        this.f7650b = hVar;
        this.f7652d = list;
        this.f7651c = i10;
        this.f7653e = popupWindow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [m8.q0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [m8.q0] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7649a;
        final int i11 = 0;
        final int i12 = 1;
        int i13 = this.f7651c;
        Object obj = this.f7653e;
        Object obj2 = this.f7652d;
        Object obj3 = this.f7650b;
        switch (i10) {
            case 0:
                final l8.z zVar = (l8.z) obj3;
                final Context context = (Context) obj2;
                final Runnable runnable = (Runnable) obj;
                zVar.g("Hex color (e.g. 000000)", String.format("%06X", Integer.valueOf(16777215 & i13)), new Consumer() { // from class: m8.q0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj4) {
                        switch (i12) {
                            case 0:
                                Context context2 = context;
                                Runnable runnable2 = runnable;
                                l8.z zVar2 = zVar;
                                try {
                                    com.bumptech.glide.c.b0(context2).edit().putInt("subtitle_font_color", Integer.parseInt(((String) obj4).replace("#", ""), 16) | (-16777216)).apply();
                                } catch (Exception e10) {
                                    Log.e("SubtitleSettingsPage", "color", e10);
                                }
                                runnable2.run();
                                zVar2.f();
                                return;
                            default:
                                Context context3 = context;
                                Runnable runnable3 = runnable;
                                l8.z zVar3 = zVar;
                                try {
                                    com.bumptech.glide.c.b0(context3).edit().putInt("subtitle_bg_color", Integer.parseInt(((String) obj4).replace("#", ""), 16) | (-16777216)).apply();
                                } catch (Exception e11) {
                                    Log.e("SubtitleSettingsPage", "bgColor", e11);
                                }
                                com.bumptech.glide.c.g0(context3, false);
                                runnable3.run();
                                zVar3.f();
                                return;
                        }
                    }
                });
                return;
            case 1:
                final l8.z zVar2 = (l8.z) obj3;
                final Context context2 = (Context) obj2;
                final Runnable runnable2 = (Runnable) obj;
                zVar2.g("Hex color (e.g. FFFFFF)", String.format("%06X", Integer.valueOf(16777215 & i13)), new Consumer() { // from class: m8.q0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj4) {
                        switch (i11) {
                            case 0:
                                Context context22 = context2;
                                Runnable runnable22 = runnable2;
                                l8.z zVar22 = zVar2;
                                try {
                                    com.bumptech.glide.c.b0(context22).edit().putInt("subtitle_font_color", Integer.parseInt(((String) obj4).replace("#", ""), 16) | (-16777216)).apply();
                                } catch (Exception e10) {
                                    Log.e("SubtitleSettingsPage", "color", e10);
                                }
                                runnable22.run();
                                zVar22.f();
                                return;
                            default:
                                Context context3 = context2;
                                Runnable runnable3 = runnable2;
                                l8.z zVar3 = zVar2;
                                try {
                                    com.bumptech.glide.c.b0(context3).edit().putInt("subtitle_bg_color", Integer.parseInt(((String) obj4).replace("#", ""), 16) | (-16777216)).apply();
                                } catch (Exception e11) {
                                    Log.e("SubtitleSettingsPage", "bgColor", e11);
                                }
                                com.bumptech.glide.c.g0(context3, false);
                                runnable3.run();
                                zVar3.f();
                                return;
                        }
                    }
                });
                return;
            default:
                n8.a aVar = (n8.a) ((f8.h) obj3).f3961a;
                PlayerActivity playerActivity = aVar.f8024b;
                playerActivity.A0 = null;
                playerActivity.B0 = "AUTO";
                aVar.I();
                aVar.G(((a8.h) ((List) obj2).get(i13)).f199b);
                ((PopupWindow) obj).dismiss();
                return;
        }
    }

    public /* synthetic */ l0(l8.z zVar, int i10, Context context, v1.z zVar2, int i11) {
        this.f7649a = i11;
        this.f7650b = zVar;
        this.f7651c = i10;
        this.f7652d = context;
        this.f7653e = zVar2;
    }
}
