package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.MonitoringEventKt;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class MonitoringEventKtKt {
    /* renamed from: -initializemonitoringEvent, reason: not valid java name */
    public static final MonitoringEventRequestOuterClass.MonitoringEvent m117initializemonitoringEvent(ub2 ub2Var) {
        ub2Var.getClass();
        MonitoringEventKt.Dsl.Companion companion = MonitoringEventKt.Dsl.Companion;
        MonitoringEventRequestOuterClass.MonitoringEvent.Builder newBuilder = MonitoringEventRequestOuterClass.MonitoringEvent.newBuilder();
        newBuilder.getClass();
        MonitoringEventKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final MonitoringEventRequestOuterClass.MonitoringEvent copy(MonitoringEventRequestOuterClass.MonitoringEvent monitoringEvent, ub2 ub2Var) {
        monitoringEvent.getClass();
        ub2Var.getClass();
        MonitoringEventKt.Dsl.Companion companion = MonitoringEventKt.Dsl.Companion;
        MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder = monitoringEvent.toBuilder();
        builder.getClass();
        MonitoringEventKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}
