package dagger.hilt.android.internal.builders;

import android.app.Service;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ServiceComponent;

@DefineComponent.Builder
/* loaded from: classes.dex */
public interface ServiceComponentBuilder {
    /* renamed from: build */
    ServiceComponent mo5build();

    ServiceComponentBuilder service(Service service);
}
