package com.google.firebase;

import androidx.annotation.Keep;
import com.bumptech.glide.c;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import p7.v0;
import p7.w;
import r6.h0;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component build = Component.builder(Qualified.qualified(Background.class, w.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final w create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Background.class, Executor.class));
                h0.s(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new v0((Executor) obj);
            }
        }).build();
        h0.s(build, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build2 = Component.builder(Qualified.qualified(Lightweight.class, w.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final w create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
                h0.s(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new v0((Executor) obj);
            }
        }).build();
        h0.s(build2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build3 = Component.builder(Qualified.qualified(Blocking.class, w.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final w create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
                h0.s(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new v0((Executor) obj);
            }
        }).build();
        h0.s(build3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build4 = Component.builder(Qualified.qualified(UiThread.class, w.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final w create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(UiThread.class, Executor.class));
                h0.s(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new v0((Executor) obj);
            }
        }).build();
        h0.s(build4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return c.M(build, build2, build3, build4);
    }
}
