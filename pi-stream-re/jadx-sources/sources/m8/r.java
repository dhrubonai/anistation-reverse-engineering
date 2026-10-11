package m8;

import android.content.Context;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7692b;

    public /* synthetic */ r(Context context, int i10) {
        this.f7691a = i10;
        this.f7692b = context;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7691a) {
            case 0:
                Context context = this.f7692b;
                com.bumptech.glide.c.b0(context).edit().putBoolean("frame_capture_enabled", ((Boolean) obj).booleanValue()).apply();
                return;
            case 1:
                Context context2 = this.f7692b;
                com.bumptech.glide.c.b0(context2).edit().putBoolean("frame_capture_always_visible", ((Boolean) obj).booleanValue()).apply();
                return;
            case 2:
                Context context3 = this.f7692b;
                com.bumptech.glide.c.b0(context3).edit().putBoolean("player_auto_rotate", ((Boolean) obj).booleanValue()).apply();
                return;
            case 3:
                Context context4 = this.f7692b;
                com.bumptech.glide.c.b0(context4).edit().putBoolean("player_remember_last_episode", ((Boolean) obj).booleanValue()).apply();
                return;
            default:
                Context context5 = this.f7692b;
                com.bumptech.glide.c.b0(context5).edit().putBoolean("auth_remember_me", ((Boolean) obj).booleanValue()).apply();
                return;
        }
    }
}
