package m8;

import android.content.Context;
import android.widget.TextView;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7646d;

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i10) {
        this.f7643a = i10;
        this.f7644b = obj;
        this.f7645c = obj2;
        this.f7646d = obj3;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        switch (this.f7643a) {
            case 0:
                Context context = (Context) this.f7644b;
                Runnable runnable = (Runnable) this.f7645c;
                l8.z zVar = (l8.z) this.f7646d;
                com.bumptech.glide.c.b0(context).edit().putInt("subtitle_bg_color", i10).apply();
                com.bumptech.glide.c.g0(context, false);
                runnable.run();
                zVar.f();
                return;
            case 1:
                Context context2 = (Context) this.f7644b;
                Runnable runnable2 = (Runnable) this.f7645c;
                l8.z zVar2 = (l8.z) this.f7646d;
                com.bumptech.glide.c.b0(context2).edit().putInt("subtitle_font_color", i10).apply();
                runnable2.run();
                zVar2.f();
                return;
            default:
                int[] iArr = (int[]) this.f7644b;
                TextView textView = (TextView) this.f7645c;
                String str = (String) this.f7646d;
                iArr[0] = i10;
                textView.setText(iArr[0] + str);
                return;
        }
    }
}
