.class public final synthetic Lcom/google/firebase/concurrent/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/google/firebase/concurrent/i;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/firebase/concurrent/i;->b:Ljava/lang/Runnable;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/google/firebase/concurrent/i;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/firebase/concurrent/i;->a:I

    iget-object v1, p0, Lcom/google/firebase/concurrent/i;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/concurrent/i;->b:Ljava/lang/Runnable;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {v2, v1}, Lcom/google/firebase/concurrent/LimitedConcurrencyExecutorService;->c(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :goto_0
    invoke-static {v2, v1}, Lcom/google/firebase/concurrent/PausableExecutorServiceImpl;->a(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
