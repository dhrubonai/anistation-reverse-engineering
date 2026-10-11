package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import defpackage.d32;
import defpackage.db;
import defpackage.fn5;
import defpackage.h41;
import defpackage.in5;
import defpackage.jn5;
import defpackage.n11;
import defpackage.nt1;
import defpackage.o11;
import defpackage.os;
import defpackage.pn6;
import defpackage.r11;
import defpackage.sx5;
import defpackage.t44;
import defpackage.tb;
import defpackage.tl7;
import defpackage.tx5;
import defpackage.u22;
import defpackage.ub2;
import defpackage.v11;
import defpackage.wi5;
import defpackage.x44;
import defpackage.y7;
import defpackage.yo0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final t44 _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final x44 batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final x44 configured;
    private final v11 coroutineScope;
    private final fn5 diagnosticEvents;
    private final x44 enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public AndroidDiagnosticEventRepository(CoroutineTimer coroutineTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, n11 n11Var) {
        coroutineTimer.getClass();
        getDiagnosticEventRequest.getClass();
        n11Var.getClass();
        this.flushTimer = coroutineTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = db.g0(db.g0(db.b(n11Var), new r11("DiagnosticEventRepository")), new AndroidDiagnosticEventRepository$special$$inlined$CoroutineExceptionHandler$1(o11.x));
        this.batch = tx5.a(nt1.x);
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = tx5.a(bool);
        this.configured = tx5.a(bool);
        in5 b = jn5.b(100, 0, null, 6);
        this._diagnosticEvents = b;
        this.diagnosticEvents = h41.c(b);
    }

    public static final pn6 configure$lambda$9(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        androidDiagnosticEventRepository.flush();
        return pn6.a;
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        if (diagnosticEvent == null) {
            return GetDiagnosticEventRequest.invoke$default(androidDiagnosticEventRepository.getDiagnosticEventRequest, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM, "null_diagnostic_event", null, null, null, null, null, null, null, null, null, 1024, null);
        }
        return diagnosticEvent;
    }

    public static final boolean flush$lambda$5(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        diagnosticEvent.getClass();
        if (!androidDiagnosticEventRepository.allowedEvents.isEmpty() && !androidDiagnosticEventRepository.allowedEvents.contains(diagnosticEvent.getEventType())) {
            return false;
        }
        return true;
    }

    public static final boolean flush$lambda$6(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        diagnosticEvent.getClass();
        return !androidDiagnosticEventRepository.blockedEvents.contains(diagnosticEvent.getEventType());
    }

    public static final String flush$lambda$7(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List list) {
        return "Unity Ads Sending diagnostic batch enabled: " + ((Boolean) ((sx5) androidDiagnosticEventRepository.enabled).getValue()).booleanValue() + " size: " + list.size() + " :: " + list;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        sx5 sx5Var;
        Object value;
        sx5 sx5Var2;
        Object value2;
        diagnosticEvent.getClass();
        if (!((Boolean) ((sx5) this.configured).getValue()).booleanValue()) {
            x44 x44Var = this.batch;
            do {
                sx5Var2 = (sx5) x44Var;
                value2 = sx5Var2.getValue();
            } while (!sx5Var2.j(value2, yo0.v0((List) value2, diagnosticEvent)));
            return;
        }
        if (((Boolean) ((sx5) this.enabled).getValue()).booleanValue()) {
            x44 x44Var2 = this.batch;
            do {
                sx5Var = (sx5) x44Var2;
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, yo0.v0((List) value, diagnosticEvent)));
            if (((List) ((sx5) this.batch).getValue()).size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        sx5 sx5Var;
        Object value;
        x44 x44Var = this.batch;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, nt1.x));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
        diagnosticEventsConfiguration.getClass();
        x44 x44Var = this.configured;
        Boolean bool = Boolean.TRUE;
        sx5 sx5Var = (sx5) x44Var;
        sx5Var.getClass();
        sx5Var.l(null, bool);
        x44 x44Var2 = this.enabled;
        Boolean valueOf = Boolean.valueOf(diagnosticEventsConfiguration.getEnabled());
        sx5 sx5Var2 = (sx5) x44Var2;
        sx5Var2.getClass();
        sx5Var2.l(null, valueOf);
        if (!((Boolean) ((sx5) this.enabled).getValue()).booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticEventsConfiguration.getAllowedEventsList();
        allowedEventsList.getClass();
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticEventsConfiguration.getBlockedEventsList();
        blockedEventsList.getClass();
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticEventsConfiguration.getMaxBatchIntervalMs(), new y7(this, (byte) 5));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        sx5 sx5Var;
        Object value;
        if (((Boolean) ((sx5) this.enabled).getValue()).booleanValue()) {
            x44 x44Var = this.batch;
            do {
                sx5Var = (sx5) x44Var;
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, nt1.x));
            Iterable iterable = (Iterable) value;
            iterable.getClass();
            final byte b = 1;
            final byte b2 = 0;
            final byte b3 = 2;
            List u0 = wi5.u0(new d32(new d32(new u22(new os(iterable, (byte) 1), new ub2(this) { // from class: sb
                public final /* synthetic */ AndroidDiagnosticEventRepository y;

                {
                    this.y = this;
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                @Override // defpackage.ub2
                public final Object invoke(Object obj) {
                    DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4;
                    boolean flush$lambda$5;
                    byte b4 = b2;
                    AndroidDiagnosticEventRepository androidDiagnosticEventRepository = this.y;
                    DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj;
                    switch (b4) {
                        case 0:
                            flush$lambda$4 = AndroidDiagnosticEventRepository.flush$lambda$4(androidDiagnosticEventRepository, diagnosticEvent);
                            return flush$lambda$4;
                        case 1:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$5(androidDiagnosticEventRepository, diagnosticEvent);
                            return Boolean.valueOf(flush$lambda$5);
                        default:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$6(androidDiagnosticEventRepository, diagnosticEvent);
                            return Boolean.valueOf(flush$lambda$5);
                    }
                }
            }, (byte) 4), true, new ub2(this) { // from class: sb
                public final /* synthetic */ AndroidDiagnosticEventRepository y;

                {
                    this.y = this;
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                @Override // defpackage.ub2
                public final Object invoke(Object obj) {
                    DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4;
                    boolean flush$lambda$5;
                    byte b4 = b;
                    AndroidDiagnosticEventRepository androidDiagnosticEventRepository = this.y;
                    DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj;
                    switch (b4) {
                        case 0:
                            flush$lambda$4 = AndroidDiagnosticEventRepository.flush$lambda$4(androidDiagnosticEventRepository, diagnosticEvent);
                            return flush$lambda$4;
                        case 1:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$5(androidDiagnosticEventRepository, diagnosticEvent);
                            return Boolean.valueOf(flush$lambda$5);
                        default:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$6(androidDiagnosticEventRepository, diagnosticEvent);
                            return Boolean.valueOf(flush$lambda$5);
                    }
                }
            }), true, new ub2(this) { // from class: sb
                public final /* synthetic */ AndroidDiagnosticEventRepository y;

                {
                    this.y = this;
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                @Override // defpackage.ub2
                public final Object invoke(Object obj) {
                    DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4;
                    boolean flush$lambda$5;
                    byte b4 = b3;
                    AndroidDiagnosticEventRepository androidDiagnosticEventRepository = this.y;
                    DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj;
                    switch (b4) {
                        case 0:
                            flush$lambda$4 = AndroidDiagnosticEventRepository.flush$lambda$4(androidDiagnosticEventRepository, diagnosticEvent);
                            return flush$lambda$4;
                        case 1:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$5(androidDiagnosticEventRepository, diagnosticEvent);
                            return Boolean.valueOf(flush$lambda$5);
                        default:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$6(androidDiagnosticEventRepository, diagnosticEvent);
                            return Boolean.valueOf(flush$lambda$5);
                    }
                }
            }));
            if (!u0.isEmpty()) {
                DeviceLog.debug(new tb(this, u0, (byte) 0));
                tl7.z(this.coroutineScope, null, null, new AndroidDiagnosticEventRepository$flush$2(this, u0, null), 3);
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public fn5 getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
