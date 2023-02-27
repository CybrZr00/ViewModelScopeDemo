package uk.co.digitaljeeves.viewmodelscopedemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*
import uk.co.digitaljeeves.viewmodelscopedemo.model.User

class MainActivityViewModel : ViewModel() {
    private var userRepository = UserRepository()
    var users : MutableLiveData<List<User>?> = MutableLiveData()
    fun getUserDate(){
        viewModelScope.launch {
            var result: List<User>? = null
            withContext(Dispatchers.IO){
                result = userRepository.getUser()
            }
            users.value = result
        }
    }
}