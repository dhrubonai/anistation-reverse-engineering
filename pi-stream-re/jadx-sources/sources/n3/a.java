package n3;

import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.n;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.w0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import r6.h0;

/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final g f7995a;

    public a(g gVar) {
        h0.u(gVar, "owner");
        this.f7995a = gVar;
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(u uVar, n nVar) {
        LinkedHashMap linkedHashMap;
        if (nVar == n.ON_CREATE) {
            uVar.getLifecycle().b(this);
            g gVar = this.f7995a;
            Bundle a10 = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(c.class);
                        h0.s(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                h0.s(newInstance, "{\n                constr…wInstance()\n            }");
                                if (gVar instanceof c1) {
                                    b1 viewModelStore = ((c1) gVar).getViewModelStore();
                                    e savedStateRegistry = gVar.getSavedStateRegistry();
                                    viewModelStore.getClass();
                                    Iterator it = new HashSet(viewModelStore.f1075a.keySet()).iterator();
                                    while (true) {
                                        boolean hasNext = it.hasNext();
                                        linkedHashMap = viewModelStore.f1075a;
                                        if (!hasNext) {
                                            break;
                                        }
                                        String str2 = (String) it.next();
                                        h0.u(str2, "key");
                                        w0 w0Var = (w0) linkedHashMap.get(str2);
                                        h0.q(w0Var);
                                        com.bumptech.glide.c.c(w0Var, savedStateRegistry, gVar.getLifecycle());
                                    }
                                    if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                        savedStateRegistry.d();
                                    }
                                } else {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException(r.f.d("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(r.f.e("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
