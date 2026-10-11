.class public final synthetic Lcom/google/firebase/components/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/firebase/components/c;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/firebase/components/c;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/firebase/components/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/firebase/components/c;->a:I

    iget-object v1, p0, Lcom/google/firebase/components/c;->b:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/components/c;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    check-cast v2, Lcom/google/firebase/components/LazySet;

    check-cast v1, Lcom/google/firebase/inject/Provider;

    invoke-static {v2, v1}, Lcom/google/firebase/components/ComponentRuntime;->c(Lcom/google/firebase/components/LazySet;Lcom/google/firebase/inject/Provider;)V

    return-void

    :pswitch_1
    check-cast v2, Lcom/google/firebase/components/OptionalProvider;

    check-cast v1, Lcom/google/firebase/inject/Provider;

    invoke-static {v2, v1}, Lcom/google/firebase/components/ComponentRuntime;->d(Lcom/google/firebase/components/OptionalProvider;Lcom/google/firebase/inject/Provider;)V

    return-void

    :goto_0
    check-cast v2, Ljava/util/Map$Entry;

    check-cast v1, Lcom/google/firebase/events/Event;

    invoke-static {v2, v1}, Lcom/google/firebase/components/EventBus;->a(Ljava/util/Map$Entry;Lcom/google/firebase/events/Event;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
