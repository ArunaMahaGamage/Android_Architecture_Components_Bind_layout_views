# Bind layout views to Architecture Components

https://developer.android.com/topic/libraries/data-binding/architecture#kotlin

Unlike objects that implement Observable—such as observable fields—LiveData objects know about the lifecycle of the observers subscribed to the data changes.

To use a LiveData object with your binding class, you need to specify a lifecycle owner to define the scope of the LiveData object. The following example specifies the activity as the lifecycle owner after the binding class has been instantiated:

'binding.setLifecycleOwner(this)' handle View Model Lifecycle base on Activity or Fragment.


      class MainActivity : AppCompatActivity() {
          override fun onCreate(savedInstanceState: Bundle?) {
              super.onCreate(savedInstanceState)
      //        setContentView(R.layout.activity_main)

              // Inflate view and obtain an instance of the binding class.
              val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

              // Specify the current activity as the lifecycle owner.
              binding.setLifecycleOwner(this)

              // Obtain the ViewModel component.
              val viewModels = UserModel()
              binding.userViewModel = viewModels
          }
      }
      
This repo have clear exampple relate to lifecycle owner base on Google Documation.
