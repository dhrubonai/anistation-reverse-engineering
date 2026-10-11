package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.y;
import androidx.lifecycle.n;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes.dex */
public final class ViewComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final boolean hasFragmentBindings;
    private final View view;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes.dex */
    public interface ViewComponentBuilderEntryPoint {
        ViewComponentBuilder viewComponentBuilder();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: classes.dex */
    public interface ViewWithFragmentComponentBuilderEntryPoint {
        ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder();
    }

    public ViewComponentManager(View view, boolean z9) {
        this.view = view;
        this.hasFragmentBindings = z9;
    }

    private Object createComponent() {
        GeneratedComponentManager<?> parentComponentManager = getParentComponentManager(false);
        if (this.hasFragmentBindings) {
            return ((ViewWithFragmentComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewWithFragmentComponentBuilderEntryPoint.class)).viewWithFragmentComponentBuilder().view(this.view).build();
        }
        return ((ViewComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewComponentBuilderEntryPoint.class)).viewComponentBuilder().view(this.view).mo4build();
    }

    private GeneratedComponentManager<?> getParentComponentManager(boolean z9) {
        if (this.hasFragmentBindings) {
            Context parentContext = getParentContext(FragmentContextWrapper.class, z9);
            if (parentContext instanceof FragmentContextWrapper) {
                return (GeneratedComponentManager) ((FragmentContextWrapper) parentContext).getFragment();
            }
            if (z9) {
                return null;
            }
            Preconditions.checkState(!(r7 instanceof GeneratedComponentManager), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.view.getClass(), getParentContext(GeneratedComponentManager.class, z9).getClass().getName());
        } else {
            Object parentContext2 = getParentContext(GeneratedComponentManager.class, z9);
            if (parentContext2 instanceof GeneratedComponentManager) {
                return (GeneratedComponentManager) parentContext2;
            }
            if (z9) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.view.getClass()));
    }

    private Context getParentContext(Class<?> cls, boolean z9) {
        Context unwrap = unwrap(this.view.getContext(), cls);
        if (unwrap == Contexts.getApplication(unwrap.getApplicationContext())) {
            Preconditions.checkState(z9, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.view.getClass());
            return null;
        }
        return unwrap;
    }

    private static Context unwrap(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
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

    public GeneratedComponentManager<?> maybeGetParentComponentManager() {
        return getParentComponentManager(true);
    }

    /* loaded from: classes.dex */
    public static final class FragmentContextWrapper extends ContextWrapper {
        private LayoutInflater baseInflater;
        private y fragment;
        private final s fragmentLifecycleObserver;
        private LayoutInflater inflater;

        public FragmentContextWrapper(Context context, y yVar) {
            super((Context) Preconditions.checkNotNull(context));
            s sVar = new s() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.s
                public void onStateChanged(u uVar, n nVar) {
                    if (nVar == n.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = sVar;
            this.baseInflater = null;
            y yVar2 = (y) Preconditions.checkNotNull(yVar);
            this.fragment = yVar2;
            yVar2.f1036d0.a(sVar);
        }

        public y getFragment() {
            Preconditions.checkNotNull(this.fragment, "The fragment has already been destroyed.");
            return this.fragment;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.inflater == null) {
                if (this.baseInflater == null) {
                    this.baseInflater = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.inflater = this.baseInflater.cloneInContext(this);
            }
            return this.inflater;
        }

        public FragmentContextWrapper(LayoutInflater layoutInflater, y yVar) {
            super((Context) Preconditions.checkNotNull(((LayoutInflater) Preconditions.checkNotNull(layoutInflater)).getContext()));
            s sVar = new s() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.s
                public void onStateChanged(u uVar, n nVar) {
                    if (nVar == n.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = sVar;
            this.baseInflater = layoutInflater;
            y yVar2 = (y) Preconditions.checkNotNull(yVar);
            this.fragment = yVar2;
            yVar2.f1036d0.a(sVar);
        }
    }
}
