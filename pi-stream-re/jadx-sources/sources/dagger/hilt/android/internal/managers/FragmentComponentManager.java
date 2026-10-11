package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.a0;
import androidx.fragment.app.b0;
import androidx.fragment.app.y;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes.dex */
public class FragmentComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final y fragment;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes.dex */
    public interface FragmentComponentBuilderEntryPoint {
        FragmentComponentBuilder fragmentComponentBuilder();
    }

    public FragmentComponentManager(y yVar) {
        this.fragment = yVar;
    }

    private Object createComponent() {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        a0 a0Var = this.fragment.J;
        b0 b0Var4 = null;
        if (a0Var == null) {
            b0Var = null;
        } else {
            b0Var = a0Var.G;
        }
        Preconditions.checkNotNull(b0Var, "Hilt Fragments must be attached before creating the component.");
        a0 a0Var2 = this.fragment.J;
        if (a0Var2 == null) {
            b0Var2 = null;
        } else {
            b0Var2 = a0Var2.G;
        }
        boolean z9 = b0Var2 instanceof GeneratedComponentManager;
        Object[] objArr = new Object[1];
        if (a0Var2 == null) {
            b0Var3 = null;
        } else {
            b0Var3 = a0Var2.G;
        }
        objArr[0] = b0Var3.getClass();
        Preconditions.checkState(z9, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", objArr);
        validate(this.fragment);
        a0 a0Var3 = this.fragment.J;
        if (a0Var3 != null) {
            b0Var4 = a0Var3.G;
        }
        return ((FragmentComponentBuilderEntryPoint) EntryPoints.get(b0Var4, FragmentComponentBuilderEntryPoint.class)).fragmentComponentBuilder().fragment(this.fragment).build();
    }

    public static ContextWrapper createContextWrapper(Context context, y yVar) {
        return new ViewComponentManager.FragmentContextWrapper(context, yVar);
    }

    public static final Context findActivity(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void initializeArguments(y yVar) {
        Preconditions.checkNotNull(yVar);
        if (yVar.f1039f == null) {
            yVar.S(new Bundle());
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                if (this.component == null) {
                    this.component = createComponent();
                }
            }
        }
        return this.component;
    }

    public void validate(y yVar) {
    }

    public static ContextWrapper createContextWrapper(LayoutInflater layoutInflater, y yVar) {
        return new ViewComponentManager.FragmentContextWrapper(layoutInflater, yVar);
    }
}
