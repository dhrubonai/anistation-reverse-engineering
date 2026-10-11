package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {101, 105, 123, 127, 170}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidLoad$invoke$2 extends t36 implements ic2 {
    final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
    final /* synthetic */ Context $context;
    final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ String $placement;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ AndroidLoad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLoad$invoke$2(AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, AndroidLoad androidLoad, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, Context context, vz0 vz0Var) {
        super(2, vz0Var);
        this.$bannerSize = bannerSize;
        this.$loadOptions = unityAdsLoadOptions;
        this.this$0 = androidLoad;
        this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
        this.$opportunityId = byteString;
        this.$placement = str;
        this.$context = context;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidLoad$invoke$2 androidLoad$invoke$2 = new AndroidLoad$invoke$2(this.$bannerSize, this.$loadOptions, this.this$0, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$context, vz0Var);
        androidLoad$invoke$2.L$0 = obj;
        return androidLoad$invoke$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidLoad$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:293|(1:(1:(1:(1:(3:299|300|301)(2:302|303))(15:304|305|306|307|197|198|199|200|201|202|(1:204)(1:227)|205|(1:207)(1:226)|208|(7:210|(6:212|(1:214)|215|216|(2:21|(1:23)(2:24|(2:26|(1:28))(2:29|30)))|32)|217|215|216|(2:21|(0)(0))|32)(16:218|(1:220)|221|(1:223)|224|225|89|90|91|(1:93)(1:122)|94|95|96|97|98|(1:116)(1:100))))(25:311|312|313|314|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(1:240)(12:196|197|198|199|200|201|202|(0)(0)|205|(0)(0)|208|(0)(0))))(24:318|319|320|321|77|78|79|80|81|(1:83)(1:126)|84|(1:86)(1:125)|87|88|89|90|91|(0)(0)|94|95|96|97|98|(0)(0)))(18:325|326|327|61|62|63|64|65|66|67|68|69|70|71|72|73|74|(1:138)(21:76|77|78|79|80|81|(0)(0)|84|(0)(0)|87|88|89|90|91|(0)(0)|94|95|96|97|98|(0)(0))))(11:3|(1:5)(1:292)|6|(1:8)(1:291)|9|(1:11)(1:290)|12|13|14|15|(4:17|18|(0)|32)(12:(1:34)(1:286)|35|36|37|38|39|40|41|42|(3:44|45|46)(1:278)|47|(7:(1:50)|52|53|54|55|56|(2:58|59)(16:60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|(0)(0)))(14:159|160|161|(1:163)(1:271)|164|165|166|167|168|169|170|171|172|(1:263)(22:174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(0)(0)))))|101|102|(2:104|(1:106)(1:108))(2:109|(2:111|112))|107|18|(0)|32|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0688, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0689, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x051b A[Catch: UnityAdsNetworkException -> 0x0522, TryCatch #19 {UnityAdsNetworkException -> 0x0522, blocks: (B:202:0x04fb, B:205:0x050c, B:207:0x051b, B:208:0x052a, B:210:0x0546, B:212:0x055d, B:216:0x056a, B:218:0x058f, B:220:0x05f4, B:221:0x05fe, B:223:0x060b, B:224:0x061c), top: B:201:0x04fb }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x06e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0546 A[Catch: UnityAdsNetworkException -> 0x0522, TryCatch #19 {UnityAdsNetworkException -> 0x0522, blocks: (B:202:0x04fb, B:205:0x050c, B:207:0x051b, B:208:0x052a, B:210:0x0546, B:212:0x055d, B:216:0x056a, B:218:0x058f, B:220:0x05f4, B:221:0x05fe, B:223:0x060b, B:224:0x061c), top: B:201:0x04fb }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x058f A[Catch: UnityAdsNetworkException -> 0x0522, TryCatch #19 {UnityAdsNetworkException -> 0x0522, blocks: (B:202:0x04fb, B:205:0x050c, B:207:0x051b, B:208:0x052a, B:210:0x0546, B:212:0x055d, B:216:0x056a, B:218:0x058f, B:220:0x05f4, B:221:0x05fe, B:223:0x060b, B:224:0x061c), top: B:201:0x04fb }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0383 A[Catch: UnityAdsNetworkException -> 0x038a, TryCatch #29 {UnityAdsNetworkException -> 0x038a, blocks: (B:81:0x0363, B:84:0x0374, B:86:0x0383, B:87:0x0391), top: B:80:0x0363 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0631  */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4, types: [long] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r24v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v31, types: [com.unity3d.ads.core.domain.AndroidLoad] */
    /* JADX WARN: Type inference failed for: r6v32, types: [com.unity3d.ads.core.domain.AndroidLoad] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v45, types: [com.unity3d.ads.core.domain.AndroidLoad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v28 */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 1836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
