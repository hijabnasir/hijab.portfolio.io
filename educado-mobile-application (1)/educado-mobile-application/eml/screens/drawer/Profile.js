import * as React from 'react';
import {View, Text, StyleSheet} from "react-native";
import LogOutButton from "../../components/profile/LogOutButton";
import {Feather} from "@expo/vector-icons";

export default function ProfileScreen() {
    return (
        <View>
            <View>
                <Text style={styles.textLogoContainer}>Profile Screen</Text>
                <Feather name="user" size={48} style={styles.tinyLogo}/>
            </View>
            <LogOutButton></LogOutButton>
        </View>

    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent : 'flex-start'
    },

    tinyLogo: {
        marginVertical: 0,
        marginHorizontal: 190,
        width: 50,
        height: 50,
        alignItems : 'center',
        justifyContent : 'center',
    },
    textLogoContainer: {
        marginHorizontal : '26%',
        marginVertical: '15%',
        fontSize: 35,
        fontWeight: '400',
        color: 'green',
        letterSpacing: 0.5,
        height: 50,
        width: 1000,
        justifyContent: 'center'
    }
});
