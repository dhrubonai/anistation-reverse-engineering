package j;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import f.p0;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final ActionProvider f5597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f5598b;

    public r(w wVar, ActionProvider actionProvider) {
        this.f5598b = wVar;
        this.f5597a = actionProvider;
    }

    public abstract /* bridge */ /* synthetic */ boolean a();

    public abstract View b(MenuItem menuItem);

    public abstract /* bridge */ /* synthetic */ boolean c();

    public abstract void d(p0 p0Var);
}
