package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.x44;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticTagKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final x44 uniqueId;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        getSharedDataTimestamps.getClass();
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.uniqueId = tx5.a(-1);
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticTagType getTag(String str) {
        switch (str.hashCode()) {
            case -2140823688:
                if (str.equals("cache_source")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CACHE;
                }
                break;
            case -1633575592:
                if (str.equals("mediation_provider")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_MEDIATION_PROVIDER;
                }
                break;
            case -989163880:
                if (str.equals("protocol")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_PROTOCOL;
                }
                break;
            case -896505829:
                if (str.equals("source")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_SOURCE;
                }
                break;
            case 116079:
                if (str.equals("url")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_HOST;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_STATE;
                }
                break;
            case 123374419:
                if (str.equals("is_retry")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_IS_RETRY;
                }
                break;
            case 296763041:
                if (str.equals("mediation_adapter_version")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_MEDIATION_ADAPTER_VERSION;
                }
                break;
            case 1162050705:
                if (str.equals("mediation_version")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_MEDIATION_VERSION;
                }
                break;
            case 1439091211:
                if (str.equals("complete_state")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_COMPLETE_STATE;
                }
                break;
            case 2105542229:
                if (str.equals("size_kb")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_SIZE_KB;
                }
                break;
        }
        return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM;
    }

    private final List<DiagnosticEventRequestOuterClass.DiagnosticTag> getTags(Map<String, String> map, Map<String, Integer> map2) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.Companion;
                DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
                newBuilder.getClass();
                DiagnosticTagKt.Dsl _create = companion._create(newBuilder);
                DiagnosticEventRequestOuterClass.DiagnosticTagType tag = getTag(entry.getKey());
                _create.setType(tag);
                if (tag == DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM) {
                    _create.setCustomTagType(entry.getKey());
                }
                _create.setStringValue(entry.getValue());
                arrayList2.add(_create._build());
            }
            arrayList.addAll(arrayList2);
        }
        if (map2 != null) {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
                DiagnosticTagKt.Dsl.Companion companion2 = DiagnosticTagKt.Dsl.Companion;
                DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder2 = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
                newBuilder2.getClass();
                DiagnosticTagKt.Dsl _create2 = companion2._create(newBuilder2);
                DiagnosticEventRequestOuterClass.DiagnosticTagType tag2 = getTag(entry2.getKey());
                _create2.setType(tag2);
                if (tag2 == DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM) {
                    _create2.setCustomTagType(entry2.getKey());
                }
                _create2.setIntValue(entry2.getValue().intValue());
                arrayList3.add(_create2._build());
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public static /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent invoke$default(GetDiagnosticEventRequest getDiagnosticEventRequest, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Map map, Map map2, Double d, Boolean bool, ByteString byteString, String str2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, Integer num, ByteString byteString2, int i, Object obj) {
        ByteString byteString3;
        if ((i & 1024) != 0) {
            byteString3 = null;
        } else {
            byteString3 = byteString2;
        }
        return getDiagnosticEventRequest.invoke(diagnosticEventType, str, map, map2, d, bool, byteString, str2, diagnosticAdType, num, byteString3);
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Map<String, String> map, Map<String, Integer> map2, Double d, Boolean bool, ByteString byteString, String str2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, Integer num, ByteString byteString2) {
        sx5 sx5Var;
        Object value;
        Integer valueOf;
        diagnosticEventType.getClass();
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        newBuilder.getClass();
        DiagnosticEventKt.Dsl _create = companion._create(newBuilder);
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : null;
        String remove = linkedHashMap != null ? linkedHashMap.remove("reason") : null;
        String remove2 = linkedHashMap != null ? linkedHashMap.remove("reason_debug") : null;
        x44 x44Var = this.uniqueId;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            valueOf = Integer.valueOf(((Number) value).intValue() + 1);
        } while (!sx5Var.j(value, valueOf));
        _create.setEventId(valueOf.intValue());
        _create.setEventType(diagnosticEventType);
        if (str != null) {
            _create.setCustomEventType(str);
        }
        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
        if (d != null) {
            _create.setTimeValue(d.doubleValue());
        }
        if (bool != null) {
            _create.setIsHeaderBidding(bool.booleanValue());
        }
        if (byteString != null) {
            _create.setImpressionOpportunityId(byteString);
        }
        if (str2 != null) {
            _create.setPlacementId(str2);
        }
        if (diagnosticAdType != null) {
            _create.setAdType(diagnosticAdType);
        }
        if (num != null) {
            _create.setHeaderBiddingTokenNumber(num.intValue());
        }
        if (remove != null) {
            _create.setReason(remove);
        }
        if (remove2 != null) {
            _create.setReasonDebug(remove2);
        }
        if (byteString2 != null) {
            _create.setErrorToken(byteString2);
        }
        _create.addAllTags(_create.getTags(), getTags(linkedHashMap, map2));
        return _create._build();
    }
}
