.class public final synthetic Lcom/google/firebase/components/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/inject/Provider;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/firebase/components/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/firebase/components/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/firebase/components/e;->a:I

    iget-object v1, p0, Lcom/google/firebase/components/e;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    check-cast v1, Lcom/google/firebase/components/ComponentRegistrar;

    invoke-static {v1}, Lcom/google/firebase/components/ComponentRuntime$Builder;->a(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v1, Lcom/google/firebase/components/ComponentRegistrar;

    invoke-static {v1}, Lcom/google/firebase/components/ComponentRuntime;->b(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;

    move-result-object v0

    return-object v0

    :goto_0
    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/firebase/components/ComponentDiscovery;->a(Ljava/lang/String;)Lcom/google/firebase/components/ComponentRegistrar;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
